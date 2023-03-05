package com.study.festlib.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
    private Integer MEM_LEVEL;
    private Integer MEM_IDX;
    private String MEM_ID;
    private String MEM_PW;
    private String MEM_NAME;
    private String MEM_EMAIL;
    private String MEM_PHONE;
}
