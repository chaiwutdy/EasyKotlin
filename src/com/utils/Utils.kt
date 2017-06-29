package com.utils

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class Utils {
	val SPRING_MODULE_PATH :String = "Spring-Module.xml"
	val CONFIG_PATH :String = "config.properties";
	val APP_CONTEXT2 :ApplicationContext = ClassPathXmlApplicationContext(SPRING_MODULE_PATH );
	companion object {
		val APP_CONTEXT :ApplicationContext = ClassPathXmlApplicationContext(Utils().SPRING_MODULE_PATH );
	}
	
}