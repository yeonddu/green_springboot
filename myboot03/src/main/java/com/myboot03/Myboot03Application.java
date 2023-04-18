package com.myboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.myboot03.member.dao.MemberDAO"})
@ComponentScan(basePackages = {"com.myboot03.board","com.myboot03.member"})
*/
public class Myboot03Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot03Application.class, args);
	}
	
}
