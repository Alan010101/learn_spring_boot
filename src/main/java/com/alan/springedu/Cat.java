package com.alan.springedu;

import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("===afterPropertiesSet===");
	}

}
