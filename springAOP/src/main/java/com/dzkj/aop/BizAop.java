package com.dzkj.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class BizAop {
	
	private static Logger log =Logger.getLogger(BizAop.class);
	
	public void 前置增强(JoinPoint jp){
		System.out.println("---前置增强---");
		log.info("当前目标对象："+jp.getTarget());
		log.info("当前调用的方法："+jp.getSignature().getName());
	}
	
	public void 后置增强(){
		System.out.println("---操作完成 提交事物---");
	}
	
	public void 环绕(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("---环绕前---");
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			System.out.println(pjp.getSignature().getName()+"方法带了："+object);
		}
		pjp.proceed();
		System.out.println("---环绕后---");
	}
	
	public void 返回通知(Object o){
		System.out.println("拿到的返回值是:"+o);
	}
	
	public void 异常通知(Exception e) {
		System.out.println("不好意思,报错了,异常名:"+e.getMessage());
		
	}
	
}
