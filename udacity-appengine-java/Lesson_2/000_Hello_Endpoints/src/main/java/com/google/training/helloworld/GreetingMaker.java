package com.google.training.helloworld;

import java.util.HashMap;
import java.util.Map;

public class GreetingMaker {

	public final static Map<String, String> greeting;
	
	static {
		greeting = new HashMap<String, String>(){{
			put("morning", "Good Morning %s!");
			put("afternoon", "Good Afternoon %s!");
			put("evening", "Good Evening %s!");
			put("night", "Good Night %s!");
		}};
	}
	
	public HelloClass createGreeting(String name, String period){
		HelloClass hello = new HelloClass();
		hello.setMessage(make(name, period));
		return hello;
	}
	
	
	private String make(String name, String period){
		String template = getTemplate(period);
		if(template ==  null) return "Invalid period!";
		return String.format(template, name);
	}
	
	private String getTemplate(String period){
		return greeting.get(period);
	}
	
}
