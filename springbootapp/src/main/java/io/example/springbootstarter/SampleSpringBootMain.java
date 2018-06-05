/**
 * 
 */
package io.example.springbootstarter;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jayaprada
 *
 */
@SpringBootApplication
public class SampleSpringBootMain {
	
	private static Logger LOG = LoggerFactory.getLogger(SampleSpringBootMain.class);
	
	@PostConstruct
	public void logEx() {
		LOG.info("testing debug message :: ");
		LOG.trace("testing trace message :: ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootMain.class, args).close();

	}

}
