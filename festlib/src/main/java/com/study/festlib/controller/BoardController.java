package com.study.festlib.controller;

import com.study.festlib.domain.Board;
import com.study.festlib.domain.Festival;
import com.study.festlib.service.BoardService;
import com.study.festlib.service.FestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/Festlib/fest")
public class BoardController {

    private final BoardService boardService;
    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }


/*    @GetMapping("/{fno}/board/writeForm") // 게시글 작성 폼
    public String putForm(@PathVariable("fno") String fno) {

        Board board = new Board();
        board.setBoard_festa_id(fno);
        return "board/putBoardForm";
    }*/

/*    @PostMapping("/{fno}/board/put") // 게시글 작성 기능
    public ResponseEntity<Objects> putBoard(@PathVariable("fno") String fno, BoardForm form) throws Exception {
        Board board = new Board();
        board.setBoard_title(form.getBoard_title());
        board.setBoard_content(form.getBoard_content());
        board.setBoard_festa_id(fno);
        return new ResponseEntity<>(boardService.insertBoard(board), HttpStatus.OK);
    }*/

    @GetMapping("/{fno}/board/{bno}") // 게시글 상세 보기
    public Board detailBoard(@PathVariable("fno") String fno, @PathVariable("bno") String bno) throws Exception {
        return boardService.selectOneBoard(fno, bno);
    }

   /* @GetMapping("/{fno}/board/board") // 게시글 리스트 조회
    public ResponseEntity<Board> getBoardList(@PathVariable("fno") String fno, Board board) {
        return new ResponseEntity<>(board, HttpStatus.OK);
    }


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
*/
}
