package com.study.festlib.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    private String board_idx; // 글 번호
    private String board_mem_id; // 작성자 id
    private String board_title; // 글 제목
    private String board_content; // 글 내용
    private String board_date; // 글 작성 날짜
    private String board_festa_id; // 페스티벌 id

}
