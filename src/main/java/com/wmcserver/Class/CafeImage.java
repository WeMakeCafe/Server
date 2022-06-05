package com.wmcserver.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class CafeImage {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long cImageNum;

    @Column(nullable = false)
    private Long cafeNum;

    @Column(nullable = false)
    private String fileUrl;

    public CafeImage(Long cafeNum, String fileUrl) {
        this.cafeNum = cafeNum;
        this.fileUrl = fileUrl;
    }
}
