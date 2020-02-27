package com.zadentech.springinfivesteps.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInFiveStepsScopeApplication {

	public static void main(String[] args) {

		final ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsScopeApplication.class,
				args);
		final PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
	}

}
