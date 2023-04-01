package com.study.festlib.service;

import com.study.festlib.domain.Reply;
import com.study.festlib.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{

    private ReplyRepository replyRepository;
    @Autowired
    public ReplyServiceImpl(ReplyRepository replyRepository) {
        this.replyRepository = replyRepository;
    }

    @Override
    public List<Reply> replyList(Long bno, String fno) {
        return replyRepository.getReplyList(bno, fno);
    }

    @Override
    public void replyPut(Reply reply) {
        replyRepository.insertOneReply(reply);
    }

    @Override
    public void replyDelete(Long bno, Long rno) {
        replyRepository.deleteOneReply(bno, rno);
    }

    @Override
    public Reply replyModify(Long bno, Long rno) {
        return replyRepository.updateOneReply(bno, rno);
    }

    @Override
    public List<Reply> myComment(String id) {
        return replyRepository.getMyReply(id);
    }
}
