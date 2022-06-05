package com.wmcserver.Class;

import com.wmcserver.Dto.LoveDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Love {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long loveNum;

    @Column(nullable = false)
    private Long reviewNum;

    @Column(nullable = false)
    private Long memNum;

    public Love(LoveDto loveDto) {
        this.reviewNum = loveDto.getReviewNum();
        this.memNum = loveDto.getMemNum();
    }

}
