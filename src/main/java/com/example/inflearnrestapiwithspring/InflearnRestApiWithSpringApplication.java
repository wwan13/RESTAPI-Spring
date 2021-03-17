package com.example.inflearnrestapiwithspring;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InflearnRestApiWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InflearnRestApiWithSpringApplication.class, args);
	}

	// 공용으로 사용 가능 하기 때문에 bean에 등록해서 사용
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
