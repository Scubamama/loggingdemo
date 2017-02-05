package loggingdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * https://logging.apache.org/log4j/2.0/manual/configuration.html#Properties
 * 
 * @author jenny
 *
 */
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Starting");

		Logger log = LogManager.getLogger(DemoApplication.class.getName());
		log.debug("Test message!!!");
		log.info("Test message!!!");
		log.error("Test message!!!", new NullPointerException("foo"));

		System.out.println("Program done.");
	}

}
