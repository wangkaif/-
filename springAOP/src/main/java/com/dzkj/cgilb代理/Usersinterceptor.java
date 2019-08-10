package com.dzkj.cgilb代理;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class Usersinterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("---事物开启---");
		Object obj = proxy.invokeSuper(o,args);
		System.out.println("---提交事物---");
		return obj;
	}

}
