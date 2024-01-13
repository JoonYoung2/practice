package com.example.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberDto {
    private Long id;
    private String userId;
    private String userPw;
    private String userNm;
    private int userAge;
}
