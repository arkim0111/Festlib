package com.study.festlib.controller;

public class BoardForm {
    private String BOARD_TITLE; // 글 제목
    private String BOARD_CONTENT; // 글 내용

    public String getBOARD_TITLE() {
        return BOARD_TITLE;
    }

    public void setBOARD_TITLE(String BOARD_TITLE) {
        this.BOARD_TITLE = BOARD_TITLE;
    }

    public String getBOARD_CONTENT() {
        return BOARD_CONTENT;
    }

    public void setBOARD_CONTENT(String BOARD_CONTENT) {
        this.BOARD_CONTENT = BOARD_CONTENT;
    }
}
