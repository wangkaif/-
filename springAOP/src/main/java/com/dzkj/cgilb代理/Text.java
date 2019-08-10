package com.dzkj.cgilb代理;

import org.springframework.cglib.proxy.Enhancer;

public class Text {
	public static void main(String[] args) {
		//创建代理配置类
		Enhancer en =new Enhancer();
		//设置被代理类
		en.setSuperclass(UsersBizImpl.class);
		//设置 代理类
		en.setCallback(new Usersinterceptor());
		//创建一个动态代理类
		UsersBizImpl ubi = (UsersBizImpl) en.create();
		ubi.注册();
	}
}
