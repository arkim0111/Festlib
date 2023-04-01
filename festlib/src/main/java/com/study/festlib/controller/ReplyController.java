package com.study.festlib.controller;

import com.study.festlib.domain.Reply;
import com.study.festlib.service.ReplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Festlib")
public class ReplyController {

    private ReplyServiceImpl replyService;
    @Autowired
    public ReplyController(ReplyServiceImpl replyService) {
        this.replyService = replyService;
    }

    @GetMapping("/fest/{fno}/board/{bno}") // 페스티벌의 댓글 리스트 조회
    public List<Reply> replyList(@PathVariable("bno") Long bno, @PathVariable("fno") String fno) {
        return replyService.replyList(bno, fno);
    }

    @PostMapping("/fest/{fno}/board/{bno}/reply/put") // 댓글 작성 기능
    public void replyPut(@RequestBody Reply reply, @PathVariable("bno") Long bno, @PathVariable("fno") String fno) {
        reply.setREPLY_BOARD_IDX(bno);
        reply.setREPLY_FESTA_ID(fno);
        replyService.replyPut(reply);
    }

    @PutMapping("/fest/{fno}/board/{bno}/reply/{rno}/modify") // 댓글 수정 기능
    public Reply replyModify
            (@RequestBody Reply reply, @PathVariable("bno") Long bno, @PathVariable("fno") String fno, @PathVariable("rno") Long rno) {
        reply.setREPLY_BOARD_IDX(bno);
        reply.setREPLY_FESTA_ID(fno);
        reply.setREPLY_BOARD_IDX(rno);
        return replyService.replyModify(bno, rno);
    }

    @GetMapping("/fest/{fno}/board/{bno}/reply/{rno}/delete") // 댓글 삭제 기능
    public void replyDelete (@PathVariable("bno") Long bno, @PathVariable("fno") String fno, @PathVariable("rno") Long rno) {
        replyService.replyDelete(bno, rno);
    }

    @GetMapping("/mypage/myComment") // (마이 페이지) 내가 쓴 게시글 조회
    public List<Reply> myComment(String id) {
        return replyService.myComment(id);
    }

}
