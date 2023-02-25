package com.study.festlib.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

    private Long reply_board_idx; // 게시글 번호
    private Long reply_idx; // 댓글 번호
    private String reply_mem_id; // 댓글 작성자 ID
    private String reply_content; // 댓글 내용
    private Date reply_date; // 댓글 작성 날짜


}
