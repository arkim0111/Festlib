package com.study.festlib.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    private Long BOARD_IDX; // 글 번호
    private String BOARD_MEM_ID; // 작성자 id
    private String BOARD_TITLE; // 글 제목
    private String BOARD_CONTENT; // 글 내용
    private LocalDate BOARD_DATE; // 글 작성 날짜
    private String BOARD_FESTA_ID; // 페스티벌 id

}
