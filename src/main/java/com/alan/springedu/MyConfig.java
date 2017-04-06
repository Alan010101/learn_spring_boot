package com.alan.springedu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean
	@Scope(value="prototype")
	public MyBean createMyBean(){
		return new MyBean();
	}
	
	@Bean
	public RunnableFactoryBean createRunnableFactoryBean(){
		return new RunnableFactoryBean();
	}
	
	@Bean
	public JeepFactory createJeepFactory(){
		return new JeepFactory();
	}
	
	@Bean
	public CarFactory createCarFactory(){
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory carFactory){
		return carFactory.createCar();
	}
	
	
}
