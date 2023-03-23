CREATE TABLE FESTIVAL (
        FESTA_ID VARCHAR2(30) PRIMARY KEY, -- 페스티벌 ID
        FESTA_YEAR NUMBER(4) NOT NULL, -- 페스티벌 연도
        FESTA_NAME VARCHAR2(50) NOT NULL, -- 페스티벌 이름
        FESTA_ADDR VARCHAR2(100) , -- 페스티벌 장소
        FESTA_DATE VARCHAR2(20), -- 페스티벌 날짜
        FESTA_CELEB VARCHAR2(50), -- 페스티벌 출연진
        FESTA_POST_IMG VARCHAR2(1000), -- 페스티벌 포스터 사진
        FESTA_SEAT_IMG VARCHAR2(1000), -- 페스티벌 좌석배치도 사진
        FESTA_TICKET_DATE VARCHAR2(20), -- 페스티벌 티켓팅 날짜
        FESTA_TICKET_ADDR VARCHAR2(1000) -- 페스티벌 티켓팅 홈페이지
);
