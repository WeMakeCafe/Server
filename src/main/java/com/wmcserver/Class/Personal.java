package com.wmcserver.Class;

import com.wmcserver.Dto.PersonalDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Personal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long memNum;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private Integer grade;

    @Column(nullable = false)
    private String favorite1;

    @Column(nullable = false)
    private String favorite2;

    private String profileImageUrl;

    private String personalQuestion;

    private String personalAnswer;

    private String confirmString;

    public Personal(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.nickName = personalDto.getNickName();
        this.grade = personalDto.getGrade();
        this.favorite1 = personalDto.getFavorite1();
        this.favorite2 = personalDto.getFavorite2();
        this.personalQuestion = personalDto.getPersonalQuestion();
        this.personalAnswer = personalDto.getPersonalAnswer();
    }

    public Personal(String id, String pwd, String nickName, Integer grade, String favorite1, String favorite2) {
        this.id = id;
        this.pwd = pwd;
        this.nickName = nickName;
        this.grade = grade;
        this.favorite1 = favorite1;
        this.favorite2 = favorite2;
    }

    public void setProfileImageUrl(String fileUrl) {
        this.profileImageUrl = fileUrl;
    }

    public void setPwd(String newPW) { this.pwd = newPW; }

    public void setConfirmString(String confirmString) { this.confirmString = confirmString; }

    public void update(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.nickName = personalDto.getNickName();
        this.grade = personalDto.getGrade();
        this.favorite1 = personalDto.getFavorite1();
        this.favorite2 = personalDto.getFavorite2();
    }
}