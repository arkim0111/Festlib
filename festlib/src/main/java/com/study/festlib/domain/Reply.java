package com.study.festlib.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

    private String reply_board_idx; // 게시글 번호
    private String reply_idx; // 댓글 번호
    private String reply_mem_id; // 댓글 작성자 ID
    private String reply_content; // 댓글 내용
    private String reply_date; // 댓글 작성 날짜


}
