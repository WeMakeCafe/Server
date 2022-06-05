package com.wmcserver.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class RequirementDto {
    private Long requireNum;
    private Long memNum;
    private Long cafeNum;
    private LocalDateTime requireTime;
    private String requireReason;
}
