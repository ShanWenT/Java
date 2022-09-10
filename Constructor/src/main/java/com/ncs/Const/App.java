package com.ncs.Const;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.Const.Employee2;
public class App {
  public static void main(String[] args) {

	  ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
      Employee2 e1 = (Employee2) ac.getBean("e1");
      System.out.println(e1);
	  
  }
}
