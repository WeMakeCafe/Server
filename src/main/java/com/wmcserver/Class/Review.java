package com.wmcserver.Class;

import com.wmcserver.Dto.ReviewDto;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Review {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long reviewNum;

    @Column(nullable = true) // 카페 외래키
    private Long cafeNum;

    @Column(nullable = false)
    private Integer likeCount;

    private String reviewText;

    private Boolean locationCheck = false;

    @CreatedDate
    private LocalDateTime createTime;

    @Column(nullable = false) //키워드 외래키
    private Long keyword1;

    @Column(nullable = false) //키워드 외래키
    private Long keyword2;

    @Column(nullable = false) //키워드 외래키
    private Long keyword3;

    @Column(nullable = false) //키워드 외래키
    private Long keyword4;

    @Column(nullable = false) //키워드 외래키
    private Long keyword5;

    @Column(nullable = false) //키워드 외래키
    private Long keyword6;

    @Column(nullable = false) //키워드 외래키
    private Long keyword7;

    @Column(nullable = false) //키워드 외래키
    private Long keyword8;

    @Column(nullable = false) //키워드 외래키
    private Long keyword9;

    @Column(nullable = false) //키워드 외래키
    private Long keyword10;

    @Column(nullable = false) //키워드 외래키
    private Long keyword11;

    @Column(nullable = false) //키워드 외래키
    private Long keyword12;

    @Column(nullable = false) //키워드 외래키
    private Long keyword13;

    @Column(nullable = false) //키워드 외래키
    private Long keyword14;

    @Column(nullable = false) //키워드 외래키
    private Long keyword15;

    @Column(nullable = false) //키워드 외래키
    private Long keyword16;

    @Column(nullable = false) //키워드 외래키
    private Long keyword17;

    @Column(nullable = false) //키워드 외래키
    private Long keyword18;

    @Column(nullable = false) //키워드 외래키
    private Long keyword19;

    @Column(nullable = false) //키워드 외래키
    private Long keyword20;

    @Column(nullable = false) //키워드 외래키
    private Long keyword21;

    @Column(nullable = false) //키워드 외래키
    private Long keyword22;

    @Column(nullable = false) //키워드 외래키
    private Long keyword23;

    @Column(nullable = false) //키워드 외래키
    private Long keyword24;

    @Column(nullable = false) //키워드 외래키
    private Long keyword25;

    @Column(nullable = false) //키워드 외래키
    private Long keyword26;

    @Column(nullable = false) //키워드 외래키
    private Long keyword27;

    @Column(nullable = false) //키워드 외래키
    private Long keyword28;

    @Column(nullable = false) //키워드 외래키
    private Long keyword29;

    @Column(nullable = false) //키워드 외래키
    private Long keyword30;

    @Column(nullable = false) //키워드 외래키
    private Long keyword31;

    @Column(nullable = false) //키워드 외래키
    private Long keyword32;

    @Column(nullable = false) //키워드 외래키
    private Long keyword33;

    @Column(nullable = false) //키워드 외래키
    private Long keyword34;

    @Column(nullable = false) //키워드 외래키
    private Long keyword35;

    @Column(nullable = false) //키워드 외래키
    private Long keyword36;

    @Column(nullable = false) // 퍼스널 외래키
    private Long memNum;

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

    public Review(ReviewDto reviewDto) {
        this.cafeNum = reviewDto.getCafeNum();
        this.likeCount = reviewDto.getLikeCount();
        this.reviewText = reviewDto.getReviewText();
        this.locationCheck = reviewDto.getLocationCheck();
        this.keyword1 = reviewDto.getKeyword1();
        this.keyword2 = reviewDto.getKeyword2();
        this.keyword3 = reviewDto.getKeyword3();
        this.keyword4 = reviewDto.getKeyword4();
        this.keyword5 = reviewDto.getKeyword5();
        this.keyword6 = reviewDto.getKeyword6();
        this.keyword7 = reviewDto.getKeyword7();
        this.keyword8 = reviewDto.getKeyword8();
        this.keyword9 = reviewDto.getKeyword9();
        this.keyword10 = reviewDto.getKeyword10();
        this.keyword11 = reviewDto.getKeyword11();
        this.keyword12 = reviewDto.getKeyword12();
        this.keyword13 = reviewDto.getKeyword13();
        this.keyword14 = reviewDto.getKeyword14();
        this.keyword15 = reviewDto.getKeyword15();
        this.keyword16 = reviewDto.getKeyword16();
        this.keyword17 = reviewDto.getKeyword17();
        this.keyword18 = reviewDto.getKeyword18();
        this.keyword19 = reviewDto.getKeyword19();
        this.keyword20 = reviewDto.getKeyword20();
        this.keyword21 = reviewDto.getKeyword21();
        this.keyword22 = reviewDto.getKeyword22();
        this.keyword23 = reviewDto.getKeyword23();
        this.keyword24 = reviewDto.getKeyword24();
        this.keyword25 = reviewDto.getKeyword25();
        this.keyword26 = reviewDto.getKeyword26();
        this.keyword27 = reviewDto.getKeyword27();
        this.keyword28 = reviewDto.getKeyword28();
        this.keyword29 = reviewDto.getKeyword29();
        this.keyword30 = reviewDto.getKeyword30();
        this.keyword31 = reviewDto.getKeyword31();
        this.keyword32 = reviewDto.getKeyword32();
        this.keyword33 = reviewDto.getKeyword33();
        this.keyword34 = reviewDto.getKeyword34();
        this.keyword35 = reviewDto.getKeyword35();
        this.keyword36 = reviewDto.getKeyword36();
        this.memNum = reviewDto.getMemNum();

        this.createTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

        this.tastePoint1 = reviewDto.getTastePoint1();
        this.tastePoint2 = reviewDto.getTastePoint2();
        this.tastePoint3 = reviewDto.getTastePoint3();
        this.tastePoint4 = reviewDto.getTastePoint4();
        this.seatPoint1 = reviewDto.getSeatPoint1();
        this.seatPoint2 = reviewDto.getSeatPoint2();
        this.seatPoint3 = reviewDto.getSeatPoint3();
        this.seatPoint4 = reviewDto.getSeatPoint4();
        this.studyPoint1 = reviewDto.getStudyPoint1();
        this.studyPoint2 = reviewDto.getStudyPoint2();
        this.studyPoint3 = reviewDto.getStudyPoint3();
        this.studyPoint4 = reviewDto.getStudyPoint4();
    }

    public void update(ReviewDto reviewDto) {
        this.likeCount = reviewDto.getLikeCount();
        this.reviewText = reviewDto.getReviewText();
        this.locationCheck = reviewDto.getLocationCheck();
        this.keyword1 = reviewDto.getKeyword1();
        this.keyword2 = reviewDto.getKeyword2();
        this.keyword3 = reviewDto.getKeyword3();
        this.keyword4 = reviewDto.getKeyword4();
        this.keyword5 = reviewDto.getKeyword5();
        this.keyword6 = reviewDto.getKeyword6();
        this.keyword7 = reviewDto.getKeyword7();
        this.keyword8 = reviewDto.getKeyword8();
        this.keyword9 = reviewDto.getKeyword9();
        this.keyword10 = reviewDto.getKeyword10();
        this.keyword11 = reviewDto.getKeyword11();
        this.keyword12 = reviewDto.getKeyword12();
        this.keyword13 = reviewDto.getKeyword13();
        this.keyword14 = reviewDto.getKeyword14();
        this.keyword15 = reviewDto.getKeyword15();
        this.keyword16 = reviewDto.getKeyword16();
        this.keyword17 = reviewDto.getKeyword17();
        this.keyword18 = reviewDto.getKeyword18();
        this.keyword19 = reviewDto.getKeyword19();
        this.keyword20 = reviewDto.getKeyword20();
        this.keyword21 = reviewDto.getKeyword21();
        this.keyword22 = reviewDto.getKeyword22();
        this.keyword23 = reviewDto.getKeyword23();
        this.keyword24 = reviewDto.getKeyword24();
        this.keyword25 = reviewDto.getKeyword25();
        this.keyword26 = reviewDto.getKeyword26();
        this.keyword27 = reviewDto.getKeyword27();
        this.keyword28 = reviewDto.getKeyword28();
        this.keyword29 = reviewDto.getKeyword29();
        this.keyword30 = reviewDto.getKeyword30();
        this.keyword31 = reviewDto.getKeyword31();
        this.keyword32 = reviewDto.getKeyword32();
        this.keyword33 = reviewDto.getKeyword33();
        this.keyword34 = reviewDto.getKeyword34();
        this.keyword35 = reviewDto.getKeyword35();
        this.keyword36 = reviewDto.getKeyword36();
        this.memNum = reviewDto.getMemNum();

        this.tastePoint1 = reviewDto.getTastePoint1();
        this.tastePoint2 = reviewDto.getTastePoint2();
        this.tastePoint3 = reviewDto.getTastePoint3();
        this.tastePoint4 = reviewDto.getTastePoint4();
        this.seatPoint1 = reviewDto.getSeatPoint1();
        this.seatPoint2 = reviewDto.getSeatPoint2();
        this.seatPoint3 = reviewDto.getSeatPoint3();
        this.seatPoint4 = reviewDto.getSeatPoint4();
        this.studyPoint1 = reviewDto.getStudyPoint1();
        this.studyPoint2 = reviewDto.getStudyPoint2();
        this.studyPoint3 = reviewDto.getStudyPoint3();
        this.studyPoint4 = reviewDto.getStudyPoint4();
    }
}