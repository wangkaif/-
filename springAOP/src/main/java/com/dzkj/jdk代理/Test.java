package com.dzkj.jdk代理;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		明星 mx = new Wkf();
		经济人 j = new 经济人(mx);
		//创建代理对象
		//newProxyInstance(代理类的加载器,被代理类的接口,代理类)
		明星 mxx = (明星) Proxy.newProxyInstance
				(j.getClass().getClassLoader(),
				mx.getClass().getInterfaces(),j);
		
		
		mxx.唱歌("葫芦娃");
		mxx.跳舞("aaa");
	}
}
