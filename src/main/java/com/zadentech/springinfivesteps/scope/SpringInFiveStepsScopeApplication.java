package com.zadentech.springinfivesteps.scope;

import com.zadentech.springinfivesteps.basic.BinarySearchImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsScopeApplication {

	public static void main(String[] args) {

		final ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsScopeApplication.class,
				args);
		final BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		final int result = binarySearch.binarySearch(new int[] { 1, 2, 12, 4 }, 3);
	}

}
