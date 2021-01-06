package com.ashsoft.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashsoft.beans.HelloMessageBean;

public class Test {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/ashsoft/cfg/applicationContext.xml");
		
		HelloMessageBean hb1 = factory.getBean("helloBean",HelloMessageBean.class);
		
		HelloMessageBean hb2 = factory.getBean("helloBean", HelloMessageBean.class);
		
		System.out.println(hb1.hashCode()+"----"+hb2.hashCode());
		
		System.out.println(hb1==hb2);

	}

}
