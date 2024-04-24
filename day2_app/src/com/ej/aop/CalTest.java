package com.ej.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalTest {

	public CalTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 1. xml loading
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPTest.xml");
		
		// 2. bean 요청
		Calculator calc=(Calculator)context.getBean("proxyCal");
		
		// 3.
		calc.add(10, 20);
		System.out.println();
//		cal.subtract();
//		System.out.println();
//		cal.multiply();
//		System.out.println();
//		cal.divide();
	}

}
