package com.study.festlib.controller;

import com.study.festlib.domain.Festival;
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

    //상세 페이지
    @GetMapping(value = "/fest/{fno}")
    public Festival festDetail(@PathVariable("fno") String fno){
        Festival festival = festService.selectOneFest(fno);

        return festival;
    }

    //페스티벌 요청
    @ResponseBody
    @PostMapping(value="/fest/request")
    public Festival requestFest (Festival festival){
        return festService.requestFest(festival);
    }

}
