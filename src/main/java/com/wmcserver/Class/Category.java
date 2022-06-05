package com.wmcserver.Class;

import com.wmcserver.Dto.CategoryDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long categoryNum;

    @Column(nullable = false) // 리뷰 외래키
    private Long reviewNum;

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


    public Category(CategoryDto categoryDto) {
        this.reviewNum = categoryDto.getReviewNum();
        this.tastePoint1 = categoryDto.getTastePoint1();
        this.tastePoint2 = categoryDto.getTastePoint2();
        this.tastePoint3 = categoryDto.getTastePoint3();
        this.tastePoint4 = categoryDto.getTastePoint4();
        this.seatPoint1 = categoryDto.getSeatPoint1();
        this.seatPoint2 = categoryDto.getSeatPoint2();
        this.seatPoint3 = categoryDto.getSeatPoint3();
        this.seatPoint4 = categoryDto.getSeatPoint4();
        this.studyPoint1 = categoryDto.getStudyPoint1();
        this.studyPoint2 = categoryDto.getStudyPoint2();
        this.studyPoint3 = categoryDto.getStudyPoint3();
        this.studyPoint4 = categoryDto.getStudyPoint4();
    }

    public void update(CategoryDto categoryDto) {
        this.reviewNum = categoryDto.getReviewNum();
        this.tastePoint1 = categoryDto.getTastePoint1();
        this.tastePoint2 = categoryDto.getTastePoint2();
        this.tastePoint3 = categoryDto.getTastePoint3();
        this.tastePoint4 = categoryDto.getTastePoint4();
        this.seatPoint1 = categoryDto.getSeatPoint1();
        this.seatPoint2 = categoryDto.getSeatPoint2();
        this.seatPoint3 = categoryDto.getSeatPoint3();
        this.seatPoint4 = categoryDto.getSeatPoint4();
        this.studyPoint1 = categoryDto.getStudyPoint1();
        this.studyPoint2 = categoryDto.getStudyPoint2();
        this.studyPoint3 = categoryDto.getStudyPoint3();
        this.studyPoint4 = categoryDto.getStudyPoint4();
    }
}