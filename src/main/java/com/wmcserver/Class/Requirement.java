package com.wmcserver.Class;

import com.wmcserver.Dto.RequirementDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
@NoArgsConstructor
@Entity
public class Requirement {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long requireNum;

    @Column(nullable = false)
    private Long memNum;

    @Column(nullable = false)
    private Long cafeNum;

    @Column(nullable = false)
    private LocalDateTime requireTime;

    @Column(nullable = false)
    private String requireReason;

    public Requirement(RequirementDto requirementDto){
        this.memNum = requirementDto.getMemNum();
        this.cafeNum = requirementDto.getCafeNum();
        this.requireReason = requirementDto.getRequireReason();

        this.requireTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
    }

    public void update(RequirementDto requirementDto){
        this.memNum = requirementDto.getMemNum();
        this.cafeNum = requirementDto.getCafeNum();
        this.requireReason = requirementDto.getRequireReason();
    }
}
