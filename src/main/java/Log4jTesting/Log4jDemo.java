package Log4jTesting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	public static void main(String[] args) {
		Logger logger=LogManager.getLogger(Log4jDemo.class);
		
		logger.trace("This is my trace message");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is an Fatal message");
		
		System.out.println("\n   completed  ");
		
	}

}
