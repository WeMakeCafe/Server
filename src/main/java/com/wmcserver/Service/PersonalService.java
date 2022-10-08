package com.wmcserver.Service;

import com.wmcserver.Dto.ChangePWDto;
import com.wmcserver.Dto.FindPWQnADto;
import com.wmcserver.Dto.LoginDto;
import com.wmcserver.Dto.PersonalDto;
import com.wmcserver.Repository.PersonalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.wmcserver.Class.Personal;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class PersonalService {

    private final PersonalRepository personalRepository;

    //아이디 중복확인 - 사용가능: TRUE
    public Boolean checkIdExist(String Id) {
        List<Personal> personalList = personalRepository.findById(Id);
        return personalList.isEmpty();
    }

    public String createRandomNumber() {
        String rand = UUID.randomUUID().toString().replaceAll("-", "");
        rand = rand.substring(0, 10);

        if(!checkRandomNumber(rand))
            createRandomNumber();

        return rand;
    }

    public Boolean checkRandomNumber(String randomNumber) {
        List<Personal> personalList = personalRepository.findByConfirmString(randomNumber);
        if(personalList.isEmpty())
            return true;
        return false;
    }

    //회원가입
    public String createMember(PersonalDto personalDto) {
        Personal personal = new Personal(personalDto);
        personal.setConfirmString(createRandomNumber());
        Personal save = personalRepository.save(personal);
        return save.getConfirmString();
    }

    //로그인
    public Long login(LoginDto loginDto) {
        List<Personal> personalList = personalRepository.findById(loginDto.getId());
        Personal personal = personalList.get(0);
        if(personal.getPwd().equals(loginDto.getPassword()))
            return personal.getMemNum();
        else
            return 0L;
    }

    //아이디 찾기
    public String findIdByConfirmString(String confirmString) {
        List<Personal> personalList = personalRepository.findByConfirmString(confirmString);
        Personal personal = personalList.get(0);
        return personal.getId();
    }

    //비밀번호 찾기 전 체크
    public String findPWByQnA(FindPWQnADto findPWQnADto) {
        List<Personal> personalList = personalRepository.findById(findPWQnADto.getId());
        Personal personal = personalList.get(0);
        if(personal.getPersonalQuestion().equals(findPWQnADto.getQuestion())) {
            if(personal.getPersonalAnswer().equals(findPWQnADto.getAnswer())) {
                return personal.getMemNum().toString();
            } else return "개인 확인용 답안이 미일치합니다.";
        } else return "개인 확인용 질문이 미일치합니다.";
    }

    //비밀번호 변경
    public Long changePW(ChangePWDto changePWDto) {
        Optional<Personal> optionalPersonal = personalRepository.findById(changePWDto.getMemNum());
        Personal personal = optionalPersonal.get();
        personal.setPwd(changePWDto.getChangePW());
        return personal.getMemNum();
    }

    @Transactional
    public Long update(Long memNum, PersonalDto personalDto) {
        Personal personal = personalRepository.findById(memNum).orElseThrow(
                () -> new IllegalArgumentException("해당 멤버 번호가 존재하지 않습니다.")
        );
        personal.update(personalDto);
        return personal.getMemNum();
    }
}
