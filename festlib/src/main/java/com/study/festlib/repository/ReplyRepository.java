package com.study.festlib.repository;

import com.study.festlib.domain.Reply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReplyRepository {
    List<Reply> getReplyList(Long bno, String fno); // 페스티벌의 댓글 리스트 조회

    void insertOneReply(Reply reply); // 댓글 작성 기능

    void deleteOneReply(Long bno, Long rno); // 댓글 삭제 기능

    Reply updateOneReply(Long bno, Long rno); // 댓글 수정 기능

    List<Reply> getMyReply(String id); // (마이 페이지) 내가 쓴 댓글 조회
}
