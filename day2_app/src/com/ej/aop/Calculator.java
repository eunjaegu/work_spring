package com.ej.aop;

public class Calculator {
//1. 타겟클래스 완성
	public Calculator() {
		
	}
	
	public void add(int x, int y) {
		int r = x+y;
		System.out.println("덧셈 결과 : " + r);
	}
	
	public void substract(int x, int y) {
		int r = x-y;
		System.out.println("뺄셈 결과 : " + r);
	}
	
	public void multiply(int x, int y) {
		int r = x*y;
		System.out.println("곱셈 결과 : " + r);
	}
	
	public void divide(int x, int y) {
		int r = x/y;
		System.out.println("나눗셈 결과 : " + r);
	}

}
