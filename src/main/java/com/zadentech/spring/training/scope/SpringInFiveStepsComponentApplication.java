package com.zadentech.spring.training.scope;

import com.zadentech.spring.training.componentscan.ComponentDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zadentech.spring.training.componentscan")
public class SpringInFiveStepsComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsComponentApplication.class);

	public static void main(String[] args) {

		final ApplicationContext applicationContext = SpringApplication.run(SpringInFiveStepsComponentApplication.class,
				args);
		final ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());
	}

}
