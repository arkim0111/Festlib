package com.study.festlib;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.study.festlib")
public class FestlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(FestlibApplication.class, args);
	}

}
