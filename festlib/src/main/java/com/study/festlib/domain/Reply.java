package com.study.festlib.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

    private Long REPLY_BOARD_IDX; // 게시글 번호
    private Long REPLY_IDX; // 댓글 번호
    private String REPLY_MEM_ID; // 댓글 작성자 ID
    private String REPLY_CONTENT; // 댓글 내용
    private LocalDate REPLY_DATE; // 댓글 작성 날짜
    private String REPLY_FESTA_ID; // 댓글 페스티벌 ID


}
