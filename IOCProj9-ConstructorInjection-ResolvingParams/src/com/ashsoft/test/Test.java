package com.ashsoft.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashsoft.beans.Marks;
import com.ashsoft.beans.Person;
import com.ashsoft.beans.Student;

public class Test {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/ashsoft/cfg/applicationContext.xml");
		
		Student std1= factory.getBean("std1Bean",Student.class);
		System.out.println(std1);
		
		Student std2= factory.getBean("std2Bean",Student.class);
		System.out.println(std2);
		
		Student std3= factory.getBean("std3Bean",Student.class);
		System.out.println(std3);
		
		Marks mks= factory.getBean("mksBean",Marks.class);
		System.out.println(mks);
		
		Person person= factory.getBean("personBean",Person.class);
		System.out.println(person);
	}
}
