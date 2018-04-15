package com.tbd.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test1Config {
	@Bean
	public MessagePrinter messagePrinter(MessageService service) {
		return(new MessagePrinter(service));			
	} 
	@Bean
	MessageService message() {
	      return new MessageService() {
	         public String getMessage() {
	            return "Hello World!";
	      }
	   };
	}
}
