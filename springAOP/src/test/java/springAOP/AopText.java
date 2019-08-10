package springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.biz.UserBiz;
import com.dzkj.declare.A;
import com.dzkj.declare.B;

public class AopText {
	public static void main(String[] args) {
		ApplicationContext ac  =new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserBiz ub = ac.getBean(UserBiz.class);
//		ub.findAll();
//		ub.delete(888);
		A a = (A) ac.getBean("a");
		a.print();
		B b = (B) ac.getBean("a");
		b.print1();
	}
}	
