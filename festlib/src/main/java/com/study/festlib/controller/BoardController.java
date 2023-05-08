package com.study.festlib.controller;

import com.study.festlib.domain.Board;
import com.study.festlib.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Festlib")

public class BoardController {

    private BoardService boardService;
    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/fest/{fno}/board/put") // 게시글 작성 기능
    public void putBoard(@PathVariable("fno") String fno, @RequestBody Board board) throws Exception {
        board.setBOARD_FESTA_ID(fno);
        boardService.insertBoard(board);
        // *** BOARD 에 들어가는 것은 확인. 하지만 postman에서는 전송이 되지 않는가,,,
    }

    @GetMapping("/fest/{fno}/board/{bno}") // 게시글 상세 보기
    public Board detailBoard(@PathVariable("fno") String fno, @PathVariable("bno") Long bno) throws Exception {
        return boardService.selectOneBoard(fno, bno);
    }

    @GetMapping("/fest/{fno}/board") // 게시글 리스트 조회
    public List<Board> getBoardList(@PathVariable("fno") String fno) {
        return boardService.selectBoardList(fno);
    }

    @PutMapping("/fest/{fno}/board/{bno}/modify") // 게시글 수정 기능
    public Board updateBoard(@PathVariable("fno") String fno, @PathVariable("bno") Long bno) throws Exception {
        return boardService.updateOneBoard(fno, bno);
    }

    @GetMapping("/boardList") // (관리자 페이지) 모든 게시글 리스트 조회
    public List<Board> boardList() {
        return boardService.selectAllBoardList();
    }

    @GetMapping("/mypage/{id}/board") // (마이 페이지) 내가 쓴 게시글 조회
    public List<Board> selectMyBoard(String id) {
        return boardService.selectMyBoard(id);
    }

}
