package com.jenkins.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@Test
 contextLoads() {
		logger.info("Test case executing...");
		logger.info("Secondo Test case executing...");
		logger.info("S5y65t5t564t465t654t654tTest case executing...");
		logger.info("prova provatTest case executing...");
		assertEquals(true, true);
	}

}
