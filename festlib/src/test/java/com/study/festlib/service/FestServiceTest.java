package com.study.festlib.service;

import com.study.festlib.domain.Festival;
import com.study.festlib.repository.FestRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class FestServiceTest {

    @Autowired
    FestService festService;

    @Autowired
    FestRepository festRepository;

    @Test
    void festDetail(){
        Festival festival = festService.festDetail("Jazz");
        log.info("festival : {}", festival);
    }
}
