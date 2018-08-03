package com.yanghui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yanghui.mapper")
public class FirstdemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(FirstdemoApplication.class, args);
	}
}
