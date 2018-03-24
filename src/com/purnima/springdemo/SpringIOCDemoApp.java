package com.purnima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach coach = context.getBean("myCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
		

	}

}
