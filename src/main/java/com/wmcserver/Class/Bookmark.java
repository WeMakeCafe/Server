package com.wmcserver.Class;

import com.wmcserver.Dto.BookmarkDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Bookmark {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long bookmarkNum;

    @Column(nullable = false)
    private Long cafeNum;

    @Column(nullable = false)
    private Long memNum;

    public Bookmark(BookmarkDto bookmarkDto){
        this.cafeNum = bookmarkDto.getCafeNum();
        this.memNum = bookmarkDto.getMemNum();
    }

    public void update(BookmarkDto bookmarkDto){
        this.cafeNum = bookmarkDto.getCafeNum();
        this.memNum = bookmarkDto.getMemNum();
    }
}
