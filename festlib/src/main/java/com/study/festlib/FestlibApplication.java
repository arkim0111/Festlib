package com.study.festlib;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FestlibApplication {

	public static void main(String[] args) {
		SpringApplication.run(FestlibApplication.class, args);
	}

}
