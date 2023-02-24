package com.study.festlib.controller;

import com.study.festlib.domain.Board;
import com.study.festlib.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Festlib")
@Controller
public class BoardController {

    private final BoardService boardService;
    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
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
}
