package com.tbd.test;
import org.springframework.context.annotation.*;

public class Test3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Test3Config.class);
		Test3 t=context.getBean(Test3.class);
		System.out.println(t.getNumber());
		context.close();
 	}
}
