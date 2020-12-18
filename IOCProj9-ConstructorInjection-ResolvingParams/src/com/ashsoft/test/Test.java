package com.ashsoft.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashsoft.beans.Customer;
import com.ashsoft.beans.Marks;
import com.ashsoft.beans.Person;
import com.ashsoft.beans.Student;

public class Test {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/ashsoft/cfg/applicationContext.xml");

		Student std1 = factory.getBean("std1Bean", Student.class);
		System.out.println(std1);
		System.out.println();

		Student std2 = factory.getBean("std2Bean", Student.class);
		System.out.println(std2);
		System.out.println();

		Student std3 = factory.getBean("std3Bean", Student.class);
		System.out.println(std3);
		System.out.println();

		Marks mks = factory.getBean("mksBean", Marks.class);
		System.out.println(mks);
		System.out.println();

		Person person = factory.getBean("personBean", Person.class);
		System.out.println(person);
		System.out.println();

		Customer cust = factory.getBean("customerBean", Customer.class);
		System.out.println(cust);

	}
}
