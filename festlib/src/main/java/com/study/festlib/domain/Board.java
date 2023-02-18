package com.study.festlib.domain;

import lombok.Data;

@Data
public class Board {

    private String title; // 글 제목
    private String content; // 글 내용
    private String date; // 글 작성 날짜

}
