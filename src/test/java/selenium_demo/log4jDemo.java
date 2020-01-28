package selenium_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log4jDemo {
	
	public static Logger logger = LogManager.getLogger(log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n.. Hello Log4j World\n");

		logger.info("Log for information massage");
		logger.error("This is Error message");
		logger.debug("We are in debuger logger tag");
		logger.warn("Warning message");
		logger.fatal("Fatal message");
		logger.trace("Trace level message maintaining");
		
		System.out.println("\n log message completed");
	
	}

}
