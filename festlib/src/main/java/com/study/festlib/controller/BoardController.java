package com.study.festlib.controller;

import com.study.festlib.domain.Board;
import com.study.festlib.domain.Festival;
import com.study.festlib.service.BoardService;
import com.study.festlib.service.FestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/Festlib/fest")
@Controller
public class BoardController {

    private final BoardService boardService;

    private final FestService festService;
    @Autowired
    public BoardController(BoardService boardService, FestService festService) {
        this.boardService = boardService;
        this.festService = festService;
    }

    @GetMapping("/board") // 게시글 리스트 조회
    public String Board(Model model) {
        List<Board> list = boardService.getFestBoardList();
        model.addAttribute("boardList", list);
        return "board/board";
    }

    @GetMapping("/boardList") // (관리자 페이지) 모든 게시글 리스트 조회
    public String boardList(Model model) {
        List<Board> list = boardService.getAllBoardList();
        model.addAttribute("boardList", list);
        return "board/boardList";
    }

    @GetMapping("/{fno}/board/writeForm") // 게시글 작성 폼
    public String putForm(@PathVariable("fno") String fno) {

        Board board = new Board();
        board.setBoard_festa_id(fno);
        return "board/putBoardForm";
    }

    @PostMapping("/{fno}/board/put") // 게시글 작성 기능
    public String putBoard(@PathVariable("fno") String fno, BoardForm form) throws Exception {

        Board board = new Board();
        board.setBoard_title(form.getBoard_title());
        board.setBoard_content(form.getBoard_content());
        board.setBoard_festa_id(fno);
        boardService.insertBoard(board);
        return "redirect:/{fno}/board/boardList";
    }

    @GetMapping("/{fno}/board/{bno}/modifyForm") // 게시글 수정 폼
    public String modifyForm(@PathVariable("fno") String fno, @PathVariable("bno") Long bno) {

        Board board = new Board();
        board.setBoard_festa_id(fno);
        board.setBoard_idx(bno);
        return "board/modifyBoardForm";
    }

    @PostMapping("/{fno}/board/{bno}/modify") // 게시글 수정 기능
    public String modifyBoard(@PathVariable("fno") String fno, @PathVariable("bno") Long bno, BoardForm form) throws Exception {

        Board board = new Board();
        board.setBoard_title(form.getBoard_title());
        board.setBoard_content(form.getBoard_content());
        board.setBoard_festa_id(fno);
        board.setBoard_idx(bno);

        boardService.modifyBoard(board);
        return "redirect:/{fno}/board/boardList";
    }

}
