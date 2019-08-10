package com.dzkj.jdk代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class 经济人 implements InvocationHandler {
	//要代理的目标对象  接口
	private 明星 mx;
	public 经济人(明星 mx) {
		this.mx =mx;
	}
	@Override
	public Object invoke(Object o, Method method, Object[] args) throws Throwable {
		System.out.println("-----表演开始    欢迎大家-----");
		if(method.getName().equals("跳舞")) {
				System.out.println("要跳舞了，请开秀");
		}else {
			System.out.println("要唱歌了,请开启土拨鼠叫声");
		}
		Object obj = method.invoke(mx, args);
		System.out.println("-----表演结束    感谢各位-----");
		return obj;
	}

}
