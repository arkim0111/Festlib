package com.study.festlib.service;

import com.study.festlib.domain.Reply;

import java.util.List;

public interface ReplyService {

    List<Reply> replyList(Long bno, String fno); // 페스티벌의 댓글 리스트 조회
    void replyPut(Reply reply); // 댓글 작성 기능
    void replyDelete(Long bno, Long rno); // 댓글 삭제 기능
    Reply replyModify(Long bno, Long rno); // 댓글 수정 기능
    List<Reply> myComment(String id); // (마이 페이지) 내가 쓴 댓글 조회
}
