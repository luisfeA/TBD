package com.tbd.test;

import org.springframework.context.annotation.*;


@ComponentScan
public class Test1Application {

	public static void main(String[] args) {
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test1Config.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
      context.close();
  }
}