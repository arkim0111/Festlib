package com.study.festlib.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Festival {

    private String FESTA_ID;
    private Integer FESTA_YEAR;
    private String FESTA_NAME;
    private String FESTA_ADDR;
    private String FESTA_DATE;
    private String FESTA_CELEB;
    private String FESTA_POST_IMG;
    private String FESTA_SEAT_IMG;
    private String FESTA_TICKET_DATE;
    private String FESTA_TICKET_ADDR;


}
