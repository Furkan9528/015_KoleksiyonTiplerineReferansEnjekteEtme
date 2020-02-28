package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		
		
		Koleksiyonlar koleksiyonlar = context.getBean("BeanKoleksiyonlar",Koleksiyonlar.class);
		
		System.out.println(koleksiyonlar);
		
		
	}
}