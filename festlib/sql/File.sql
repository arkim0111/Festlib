CREATE TABLE FILE(
        FILE_NUM VARCHAR2(30) PRIMARY KEY, -- 파일 번호
        FILE_TYPE NUMBER(5), -- 파일 유형
        BOARD_IDX NUMBER(10) NOT NULL, -- 게시글 번호
        FILE_ORGNAME VARCHAR2(50) NOT NULL, -- 기존 이름
        FILE_STDNAME VARCHAR2(50) NOT NULL, -- 저장 이름
        FILE_SIZE VARCHAR2(20) NOT NULL, -- 파일 사이즈
        FILE_DEL BOOLEAN NOT NULL, -- 삭제여부
         );


    CREATE SEQUENCE FILE_NUM_SEQ
    START WITH 1
    INCREMENT BY 1;

COMMIT;