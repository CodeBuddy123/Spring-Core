package com.ashsoft.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashsoft.beans.A;

public class Test {
	
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/ashsoft/cfg/applicationContext.xml");
		
		A a = factory.getBean("a1",A.class);
		System.out.println(a);
	}
}
