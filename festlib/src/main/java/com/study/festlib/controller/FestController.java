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

    //페스티벌 등록 요청
    @PostMapping(value="/fest/request")
    public void requestFest (Festival festival){
        festService.requestFest(festival);
    }


    //관리자
    //등록된 페스티벌 리스트
    @GetMapping(value = "/festLis")
    public List<Festival> festList(){

    }
    //등록요청받은 페스티벌 리스트
    //페스티벌 수정
    //페스티벌 등록 요청 수락

}
