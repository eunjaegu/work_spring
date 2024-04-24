package com.ej.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
// 2. 어드바이스클래스 완성
	public LoggingAdvice() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable{
	//conection 실행
	System.out.println("메서드 호출 전");
	System.out.println(invocation.getMethod() + "호출 전");
	
	Object o = invocation.proceed();
	//호출하는 부분 실행
	
	//conection 제거
	System.out.println(invocation.getMethod() + "호출 후");
	System.out.println("메서드 호출 후");
	
	return o;
	}
	
}
