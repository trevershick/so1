package com.trevershick.github.proof.so1;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItWorks {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Map<String,Object> mapOfFoos = (Map<String, Object>) ctx.getBean("mapOfFoos",Map.class);
		
		for (Entry<String, Object> i : mapOfFoos.entrySet()) {
			System.out.println(i.getKey() + "=>" + i.getValue());
		}

	}

}
