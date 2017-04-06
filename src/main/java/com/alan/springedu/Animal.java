package com.alan.springedu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Animal {
	
	@PostConstruct
	public void init(){
		System.out.println("==Animal init==");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("==Animal destroy==");
	}
}
