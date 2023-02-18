package com.study.festlib.controller;

import com.study.festlib.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/Festlib")
@RestController
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public String Board(Model model) {
        model.addAttribute("boardList", boardService.boardList());
        return "board";
    }
}
