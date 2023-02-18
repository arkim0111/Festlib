package com.study.festlib.controller;

import com.study.festlib.domain.Festival;
import com.study.festlib.repository.FestRepository;
import com.study.festlib.service.FestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/Festlib")
@RestController
public class FestController {

    @Autowired
    FestService festService;

    @GetMapping(value = "/fest/{fno}")
    public Festival festDetail(@PathVariable("fno") String fno){
        Festival festival = festService.selectOneFest(fno);

        return festival;
    }

}
