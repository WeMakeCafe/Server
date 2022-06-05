package com.wmcserver.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
    private Long categoryNum;
    private Long reviewNum;
    private Integer tastePoint1;
    private Integer tastePoint2;
    private Integer tastePoint3;
    private Integer tastePoint4;
    private Integer seatPoint1;
    private Integer seatPoint2;
    private Integer seatPoint3;
    private Integer seatPoint4;
    private Integer studyPoint1;
    private Integer studyPoint2;
    private Integer studyPoint3;
    private Integer studyPoint4;
}