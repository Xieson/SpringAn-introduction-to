package com.syzy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
			//���������ļ�
	ApplicationContext application=new ClassPathXmlApplicationContext("beam.xml");
	Springbean bb=(Springbean)application.getBean("springbean");
	Springbean2 cc=(Springbean2)application.getBean("sp");
	bb.add();
	System.out.println(cc);
	}

}
