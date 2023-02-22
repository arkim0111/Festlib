package com.study.festlib.service;

import com.study.festlib.domain.Board;
import com.study.festlib.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getFestBoardList() {
        return boardRepository.getFestBoardList();
    }
}
