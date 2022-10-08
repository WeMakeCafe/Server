package com.wmcserver.Controller;

import com.wmcserver.Class.Personal;
import com.wmcserver.Dto.ChangePWDto;
import com.wmcserver.Dto.FindPWQnADto;
import com.wmcserver.Dto.LoginDto;
import com.wmcserver.Dto.PersonalDto;
import com.wmcserver.Service.PersonalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final PersonalService personalService;

    //아이디 중복확인
    @GetMapping("/check/id")
    public Boolean checkIdExist(@RequestParam("checkId") String checkId) {
        return personalService.checkIdExist(checkId);
    }

    //회원가입
    @PostMapping("/signup")
    public String createPersonal(@RequestBody PersonalDto personalDto) {
        return personalService.createMember(personalDto);
    }

    //로그인
    @PutMapping("/login")
    public Long login(@RequestBody LoginDto loginDto) {
        return personalService.login(loginDto);
    }

    //아이디 찾기
    @GetMapping("/find/id")
    public String findIdByConfirmString(@RequestParam("confirmString") String confirmString) {
        return personalService.findIdByConfirmString(confirmString);
    }

    //비밀번호 변경 전 개인 확인
    @PutMapping("/find/pw")
    public String findPWByQnA(@RequestBody FindPWQnADto findPWQnADto) {
        return personalService.findPWByQnA(findPWQnADto);
    }

    //비밀번호 변경
    @PutMapping("/change/pw")
    public Long changePW(@RequestBody ChangePWDto changePWDto) {
        return personalService.changePW(changePWDto);
    }

}
