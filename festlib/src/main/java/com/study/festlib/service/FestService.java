package com.study.festlib.service;

import com.study.festlib.domain.Festival;
import com.study.festlib.repository.FestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FestService {

    @Autowired
    private FestRepository festRepository;

    public Festival festDetail(String FESTA_ID){
        return festRepository.selectOneFest(FESTA_ID);
    }
}
