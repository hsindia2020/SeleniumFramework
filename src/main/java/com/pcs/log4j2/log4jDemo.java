package com.pcs.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log4jDemo {
	
	public static Logger logger = LogManager.getLogger(log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n.. Hello Log4j World... \n");

		System.out.println("Log4j 2 is Running...");
		logger.info("Log for information massage\n");
		logger.error("This is Error message\n");
		logger.debug("We are in debuger logger tag\n");
		logger.warn("Warning message\n");
		logger.fatal("Fatal message\n");
		logger.trace("Trace level message maintaining\n");
		
		System.out.println("\n log message completed");
	
	}

}
