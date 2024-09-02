package com.jenkins.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class JenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Applicazione iniziata");
	}

	public static void main(String[] args) {
		logger.info("Applicazione in esecuzione");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
