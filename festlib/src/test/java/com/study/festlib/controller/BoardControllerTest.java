package com.study.festlib.controller;

import com.study.festlib.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class BoardControllerTest {

    @Autowired
    BoardController boardController;

    @Test
    @DisplayName("게시글 등록 테스트")
    void 게시글등록() throws Exception {
        // given
        Board board = new Board();
        // board_idx, date는 자동 생성
        board.setBOARD_MEM_ID("mem1");
        board.setBOARD_TITLE("제목1");
        board.setBOARD_CONTENT("내용1");
        board.setBOARD_FESTA_ID("sjf");
        String fno = "sjf";

        //when
        boardController.putBoard(fno, board);


        // then
        log.info("test : " + board.getBOARD_MEM_ID() + "게시글 등록 완료");
    }


}
