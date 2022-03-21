package com.acs.loggapp;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class Employee {

	//create logger for selected class
	private static Logger log = Logger.getLogger(Employee.class);
	
	public static void main(String[] args) throws Exception {
	
		//create simple  layout only print priority level messages
		
		//Layout layout = new SimpleLayout();
		
		//Html layout
		//Layout layout = new HTMLLayout();
		
		
		//Xml Layout
		//Layout layout = new XMLLayout();
		
		// ** Pattern layout recomonded
		
		//Layout layout = new PatternLayout("%p %d{dd:MM:yyy HH:mm:ss SSS} {%C} [%M] %l %m %n");
		
		
		// 
		
		//create appender Console appender
		//Appender appender = new ConsoleAppender(layout);
		
		// create 	fIle appender
		//Appender appender = new FileAppender(layout, "C:\\Users\\abhishek.moola\\Desktop\\mylogging\\data.log");
		
		// link appender with logger
		//log.addAppender(appender);
		
		
		//instead of writing code here you can configure logger and layout and appender details in log4j.properties file
		
		
		//we use priority methods
		
		log.debug("from debug");
		log.info("from info");
		log.error("from error");
		log.warn("from warn");
		System.out.println("done");
		

	}

}
