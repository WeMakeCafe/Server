package com.wmcserver.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class ReviewImage {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long rImageNum;

    @Column(nullable = false)
    private Long memNum;

    @Column(nullable = false)
    private Long reviewNum;

    @Column(nullable = false)
    private String fileUrl;

    public ReviewImage(Long memNum, Long reviewNum, String fileUrl) {
        this.memNum = memNum;
        this.reviewNum = reviewNum;
        this.fileUrl = fileUrl;
    }
}
