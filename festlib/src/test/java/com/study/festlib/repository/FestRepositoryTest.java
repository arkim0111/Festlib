package com.study.festlib.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class FestRepositoryTest {

    @Autowired
    private FestRepository festRepository;

    @Test
    public void testgetList(){
        log.info("ID : "+festRepository.selectFestivals());
    }
}
