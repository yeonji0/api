package com.board.api;

import com.board.api.board.mapper.BoardMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
