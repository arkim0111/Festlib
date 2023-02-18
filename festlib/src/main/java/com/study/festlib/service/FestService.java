package com.study.festlib.service;

import com.study.festlib.domain.Festival;
import com.study.festlib.repository.FestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestService{

    @Autowired
    private FestRepository festRepository;


    public Festival selectOneFest(String festa_id) {
        return festRepository.selectOneFest(festa_id);
    }
}
