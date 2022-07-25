package com.example.springflumeexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.logging.log4j.*;


@SpringBootTest
class SpringFlumeExampleApplicationTests {
	
	Logger logger = LogManager.getLogger();

	@Test
	void contextLoads() {
	}

	@Test
	void testing() {
		logger.info("info "+logger.getClass().getName());
		logger.error("error");
		
		
		
	}
}
