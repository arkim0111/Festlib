package com.study.festlib.controller;

public class BoardForm {
    private String board_title; // 글 제목
    private String board_content; // 글 내용


    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getBoard_content() {
        return board_content;
    }

    public void setBoard_content(String board_content) {
        this.board_content = board_content;
    }

}
