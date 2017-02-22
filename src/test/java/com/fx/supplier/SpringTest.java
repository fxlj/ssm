package com.fx.supplier;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fx.supplier.basedata.service.UserService;

public class SpringTest {

	@Test
	public void testSpring() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		UserService bean = (UserService) context.getBean("userService");
		System.out.println(bean);
	}
}
