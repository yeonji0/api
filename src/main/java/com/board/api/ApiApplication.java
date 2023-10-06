package com.board.api;

import com.board.api.board.mapper.BoardMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiApplication {
	private final BoardMapper boardMapper;

	public ApiApplication(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	public void run(String... args) throws Exception {
	}

}
