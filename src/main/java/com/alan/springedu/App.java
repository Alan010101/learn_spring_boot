package com.alan.springedu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(context.getBean(MyBean.class));
		System.out.println(context.getBean("createMyBean"));
		System.out.println(context.getBean(Runnable.class));
		System.out.println(context.getBean(RunnableFactoryBean.class));
		System.out.println(context.getBean("createRunnableFactoryBean"));
		System.out.println(context.getBean("&createRunnableFactoryBean"));
		System.out.println(context.getBean(JeepFactory.class));
		System.out.println(context.getBean(Car.class));
		context.close();
	}
}
