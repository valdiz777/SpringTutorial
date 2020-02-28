package com.zadentech.spring.training;

import com.zadentech.spring.training.basic.BinarySearchImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsBasicApplication.class);

	public static void main(String[] args) {

		final ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsBasicApplication.class,
				args);
		final BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		final int result = binarySearch.binarySearch(new int[] { 1, 2, 12, 4 }, 3);
		LOGGER.info("result is: {}", result);
	}
}
