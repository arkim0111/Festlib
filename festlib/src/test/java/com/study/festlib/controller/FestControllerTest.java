package com.study.festlib.controller;

import com.study.festlib.domain.Festival;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class FestControllerTest {

    @Autowired
    private FestController festController;

    @Test
    void testRequestFest(){

        Festival festival = new Festival();
        festival.setFESTA_ID("Rock");
        festival.setFESTA_YEAR(2023);
        festival.setFESTA_NAME("락페스티벌");
        festival.setFESTA_ADDR("부산");
        festival.setFESTA_DATE("2023-02-26");
        festival.setFESTA_CELEB("Singer");
        festival.setFESTA_TICKET_DATE("2023-02-02");
        festival.setFESTA_TICKET_ADDR("http://ticket.interpark.com");

        festController.requestFest(festival);

        Festival findFestival = festController.festDetail("Rock");
        log.info("인서트 정보:  "+findFestival);
    }
}
