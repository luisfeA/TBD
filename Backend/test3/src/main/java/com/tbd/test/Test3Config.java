package com.tbd.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test3Config {
	@Bean
	public Test3 picoctm() {
		return new Test3();		
	}
}
