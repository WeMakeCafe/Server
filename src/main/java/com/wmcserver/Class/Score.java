package com.wmcserver.Class;

import com.wmcserver.Dto.ScoreDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Score {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long scoreNum;

    @Column(nullable = false)
    private Long cafeNum;

    @Column(nullable = false)
    private Long reviewNum;

    @Column(nullable = false)
    private Long categoryNum;

    @Column(nullable = false)
    private Integer tastePoint1;

    @Column(nullable = false)
    private Integer tastePoint2;

    @Column(nullable = false)
    private Integer tastePoint3;

    @Column(nullable = false)
    private Integer tastePoint4;

    @Column(nullable = false)
    private Integer seatPoint1;

    @Column(nullable = false)
    private Integer seatPoint2;

    @Column(nullable = false)
    private Integer seatPoint3;

    @Column(nullable = false)
    private Integer seatPoint4;

    @Column(nullable = false)
    private Integer studyPoint1;

    @Column(nullable = false)
    private Integer studyPoint2;

    @Column(nullable = false)
    private Integer studyPoint3;

    @Column(nullable = false)
    private Integer studyPoint4;

    @Column(nullable = false)
    private Integer tastePoint1_AVG;

    @Column(nullable = false)
    private Integer tastePoint2_AVG;

    @Column(nullable = false)
    private Integer tastePoint3_AVG;

    @Column(nullable = false)
    private Integer tastePoint4_AVG;

    @Column(nullable = false)
    private Integer seatPoint1_AVG;

    @Column(nullable = false)
    private Integer seatPoint2_AVG;

    @Column(nullable = false)
    private Integer seatPoint3_AVG;

    @Column(nullable = false)
    private Integer seatPoint4_AVG;

    @Column(nullable = false)
    private Integer studyPoint1_AVG;

    @Column(nullable = false)
    private Integer studyPoint2_AVG;

    @Column(nullable = false)
    private Integer studyPoint3_AVG;

    @Column(nullable = false)
    private Integer studyPoint4_AVG;

    public Score(ScoreDto scoreDto){
        this.cafeNum = scoreDto.getCafeNum();
        this.reviewNum = scoreDto.getReviewNum();
        this.categoryNum = scoreDto.getCategoryNum();

        this.tastePoint1 = scoreDto.getTastePoint1();
        this.tastePoint2 = scoreDto.getTastePoint2();
        this.tastePoint3 = scoreDto.getTastePoint3();
        this.tastePoint4 = scoreDto.getTastePoint4();
        this.seatPoint1 = scoreDto.getSeatPoint1();
        this.seatPoint2 = scoreDto.getSeatPoint2();
        this.seatPoint3 = scoreDto.getSeatPoint3();
        this.seatPoint4 = scoreDto.getSeatPoint4();
        this.studyPoint1 = scoreDto.getStudyPoint1();
        this.studyPoint2 = scoreDto.getStudyPoint2();
        this.studyPoint3 = scoreDto.getStudyPoint3();
        this.studyPoint4 = scoreDto.getStudyPoint4();

        this.tastePoint1_AVG = scoreDto.getTastePoint1_AVG();
        this.tastePoint2_AVG = scoreDto.getTastePoint2_AVG();
        this.tastePoint3_AVG = scoreDto.getTastePoint3_AVG();
        this.tastePoint4_AVG = scoreDto.getTastePoint4_AVG();
        this.seatPoint1_AVG = scoreDto.getSeatPoint1_AVG();
        this.seatPoint2_AVG = scoreDto.getSeatPoint2_AVG();
        this.seatPoint3_AVG = scoreDto.getSeatPoint3_AVG();
        this.seatPoint4_AVG = scoreDto.getSeatPoint4_AVG();
        this.studyPoint1_AVG = scoreDto.getStudyPoint1_AVG();
        this.studyPoint2_AVG = scoreDto.getStudyPoint2_AVG();
        this.studyPoint3_AVG = scoreDto.getStudyPoint3_AVG();
        this.studyPoint4_AVG = scoreDto.getStudyPoint4_AVG();
    }

    public void update(ScoreDto scoreDto){
        this.cafeNum = scoreDto.getCafeNum();
        this.reviewNum = scoreDto.getReviewNum();

        this.tastePoint1 = scoreDto.getTastePoint1();
        this.tastePoint2 = scoreDto.getTastePoint2();
        this.tastePoint3 = scoreDto.getTastePoint3();
        this.tastePoint4 = scoreDto.getTastePoint4();
        this.seatPoint1 = scoreDto.getSeatPoint1();
        this.seatPoint2 = scoreDto.getSeatPoint2();
        this.seatPoint3 = scoreDto.getSeatPoint3();
        this.seatPoint4 = scoreDto.getSeatPoint4();
        this.studyPoint1 = scoreDto.getStudyPoint1();
        this.studyPoint2 = scoreDto.getStudyPoint2();
        this.studyPoint3 = scoreDto.getStudyPoint3();
        this.studyPoint4 = scoreDto.getStudyPoint4();

        this.tastePoint1_AVG = scoreDto.getTastePoint1_AVG();
        this.tastePoint2_AVG = scoreDto.getTastePoint2_AVG();
        this.tastePoint3_AVG = scoreDto.getTastePoint3_AVG();
        this.tastePoint4_AVG = scoreDto.getTastePoint4_AVG();
        this.seatPoint1_AVG = scoreDto.getSeatPoint1_AVG();
        this.seatPoint2_AVG = scoreDto.getSeatPoint2_AVG();
        this.seatPoint3_AVG = scoreDto.getSeatPoint3_AVG();
        this.seatPoint4_AVG = scoreDto.getSeatPoint4_AVG();
        this.studyPoint1_AVG = scoreDto.getStudyPoint1_AVG();
        this.studyPoint2_AVG = scoreDto.getStudyPoint2_AVG();
        this.studyPoint3_AVG = scoreDto.getStudyPoint3_AVG();
        this.studyPoint4_AVG = scoreDto.getStudyPoint4_AVG();
    }
}

/*
    @Column(nullable = false)
    private Integer tastePoint1;

    @Column(nullable = false)
    private Integer tastePoint2;

    @Column(nullable = false)
    private Integer tastePoint3;

    @Column(nullable = false)
    private Integer tastePoint4;

    @Column(nullable = false)
    private Integer seatPoint1;

    @Column(nullable = false)
    private Integer seatPoint2;

    @Column(nullable = false)
    private Integer seatPoint3;

    @Column(nullable = false)
    private Integer seatPoint4;

    @Column(nullable = false)
    private Integer studyPoint1;

    @Column(nullable = false)
    private Integer studyPoint2;

    @Column(nullable = false)
    private Integer studyPoint3;

    @Column(nullable = false)
    private Integer studyPoint4; */

/*
    this.tastePoint1 = scoreDto.getTastePoint1();
    this.tastePoint2 = scoreDto.getTastePoint2();
    this.tastePoint3 = scoreDto.getTastePoint3();
    this.tastePoint4 = scoreDto.getTastePoint4();
    this.seatPoint1 = scoreDto.getSeatPoint1();
    this.seatPoint2 = scoreDto.getSeatPoint2();
    this.seatPoint3 = scoreDto.getSeatPoint3();
    this.seatPoint4 = scoreDto.getSeatPoint4();
    this.studyPoint1 = scoreDto.getStudyPoint1();
    this.studyPoint2 = scoreDto.getStudyPoint2();
    this.studyPoint3 = scoreDto.getStudyPoint3();
    this.studyPoint4 = scoreDto.getStudyPoint4();
 */