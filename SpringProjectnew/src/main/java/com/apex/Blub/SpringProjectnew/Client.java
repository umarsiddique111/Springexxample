package com.apex.Blub.SpringProjectnew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("com/apex/Blub/SpringProjectnew/applicationcontext.xml");
			System.out.println(context);
			BulbServices b = (BulbServices)context.getBean("bulb");
			System.out.println(b);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
