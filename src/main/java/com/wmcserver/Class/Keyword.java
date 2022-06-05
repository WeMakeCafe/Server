package com.wmcserver.Class;

import com.wmcserver.Dto.KeywordDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Keyword {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long keywordNum;

    @Column(nullable = false)
    private Long reviewNum;

    @Column(nullable = false)
    private Integer eating1;

    @Column(nullable = false)
    private Integer eating2;

    @Column(nullable = false)
    private Integer eating3;

    @Column(nullable = false)
    private Integer eating4;

    @Column(nullable = false)
    private Integer eating5;

    @Column(nullable = false)
    private Integer eating6;

    @Column(nullable = false)
    private Integer eating7;

    @Column(nullable = false)
    private Integer eating8;

    @Column(nullable = false)
    private Integer eating9;

    @Column(nullable = false)
    private Integer eating10;

    @Column(nullable = false)
    private Integer eating11;

    @Column(nullable = false)
    private Integer eating12;

    @Column(nullable = false)
    private Integer mood1;

    @Column(nullable = false)
    private Integer mood2;

    @Column(nullable = false)
    private Integer mood3;

    @Column(nullable = false)
    private Integer mood4;

    @Column(nullable = false)
    private Integer mood5;

    @Column(nullable = false)
    private Integer mood6;

    @Column(nullable = false)
    private Integer mood7;

    @Column(nullable = false)
    private Integer mood8;

    @Column(nullable = false)
    private Integer mood9;

    @Column(nullable = false)
    private Integer mood10;

    @Column(nullable = false)
    private Integer mood11;

    @Column(nullable = false)
    private Integer mood12;

    @Column(nullable = false)
    private Integer service1;

    @Column(nullable = false)
    private Integer service2;

    @Column(nullable = false)
    private Integer service3;

    @Column(nullable = false)
    private Integer service4;

    @Column(nullable = false)
    private Integer service5;

    @Column(nullable = false)
    private Integer service6;

    @Column(nullable = false)
    private Integer service7;

    @Column(nullable = false)
    private Integer service8;

    @Column(nullable = false)
    private Integer service9;

    @Column(nullable = false)
    private Integer service10;

    @Column(nullable = false)
    private Integer service11;

    @Column(nullable = false)
    private Integer service12;

    public Keyword(KeywordDto keywordDto){
        this.reviewNum = keywordDto.getReviewNum();

        this.eating1 = keywordDto.getEating1();
        this.eating2 = keywordDto.getEating2();
        this.eating3 = keywordDto.getEating3();
        this.eating4 = keywordDto.getEating4();
        this.eating5 = keywordDto.getEating5();
        this.eating6 = keywordDto.getEating6();
        this.eating7 = keywordDto.getEating7();
        this.eating8 = keywordDto.getEating8();
        this.eating9 = keywordDto.getEating9();
        this.eating10 = keywordDto.getEating10();
        this.eating11 = keywordDto.getEating11();
        this.eating12 = keywordDto.getEating12();

        this.mood1 = keywordDto.getMood1();
        this.mood2 = keywordDto.getMood2();
        this.mood3 = keywordDto.getMood3();
        this.mood4 = keywordDto.getMood4();
        this.mood5 = keywordDto.getMood5();
        this.mood6 = keywordDto.getMood6();
        this.mood7 = keywordDto.getMood7();
        this.mood8 = keywordDto.getMood8();
        this.mood9 = keywordDto.getMood9();
        this.mood10 = keywordDto.getMood10();
        this.mood11 = keywordDto.getMood11();
        this.mood12 = keywordDto.getMood12();

        this.service1 = keywordDto.getService1();
        this.service2 = keywordDto.getService2();
        this.service3 = keywordDto.getService3();
        this.service4 = keywordDto.getService4();
        this.service5 = keywordDto.getService5();
        this.service6 = keywordDto.getService6();
        this.service7 = keywordDto.getService7();
        this.service8 = keywordDto.getService8();
        this.service9 = keywordDto.getService9();
        this.service10 = keywordDto.getService10();
        this.service11 = keywordDto.getService11();
        this.service12 = keywordDto.getService12();
    }

    public void update(KeywordDto keywordDto){
        this.eating1 = keywordDto.getEating1();
        this.eating2 = keywordDto.getEating2();
        this.eating3 = keywordDto.getEating3();
        this.eating4 = keywordDto.getEating4();
        this.eating5 = keywordDto.getEating5();
        this.eating6 = keywordDto.getEating6();
        this.eating7 = keywordDto.getEating7();
        this.eating8 = keywordDto.getEating8();
        this.eating9 = keywordDto.getEating9();
        this.eating10 = keywordDto.getEating10();
        this.eating11 = keywordDto.getEating11();
        this.eating12 = keywordDto.getEating12();

        this.mood1 = keywordDto.getMood1();
        this.mood2 = keywordDto.getMood2();
        this.mood3 = keywordDto.getMood3();
        this.mood4 = keywordDto.getMood4();
        this.mood5 = keywordDto.getMood5();
        this.mood6 = keywordDto.getMood6();
        this.mood7 = keywordDto.getMood7();
        this.mood8 = keywordDto.getMood8();
        this.mood9 = keywordDto.getMood9();
        this.mood10 = keywordDto.getMood10();
        this.mood11 = keywordDto.getMood11();
        this.mood12 = keywordDto.getMood12();

        this.service1 = keywordDto.getService1();
        this.service2 = keywordDto.getService2();
        this.service3 = keywordDto.getService3();
        this.service4 = keywordDto.getService4();
        this.service5 = keywordDto.getService5();
        this.service6 = keywordDto.getService6();
        this.service7 = keywordDto.getService7();
        this.service8 = keywordDto.getService8();
        this.service9 = keywordDto.getService9();
        this.service10 = keywordDto.getService10();
        this.service11 = keywordDto.getService11();
        this.service12 = keywordDto.getService12();
    }
}
