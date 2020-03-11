package com.zadentech.spring.training;

import com.zadentech.spring.training.properties.SomeExternalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringInFiveStepsPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFiveStepsPropertiesApplication.class);

	public static void main(String[] args) {

		final ApplicationContext applicationContext = SpringApplication
				.run(SpringInFiveStepsPropertiesApplication.class,
				args);
		final SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		LOGGER.info("{}", service.returnServiceURL());
	}
}
