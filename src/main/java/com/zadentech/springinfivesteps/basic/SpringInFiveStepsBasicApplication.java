package com.zadentech.springinfivesteps.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsBasicApplication {

	public static void main(String[] args) {

		final ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsBasicApplication.class,
				args);
		final BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		final int result = binarySearch.binarySearch(new int[] { 1, 2, 12, 4 }, 3);
	}

}
