package com.wmcserver.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonalDto {
    private Long memNum;
    private String id;
    private String pwd;
    private String nickName;
    private Integer grade;
    private String address;
    private Integer phoneNum;
    private String favorite1;
    private String favorite2;
}

