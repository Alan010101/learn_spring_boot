package com.alan.springedu;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Runnable>{

	@Override
	public Runnable getObject() throws Exception {
		return new Runnable() {
			@Override
			public void run() {
			}
		};
	}

	@Override
	public Class<?> getObjectType() {
		return Runnable.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
