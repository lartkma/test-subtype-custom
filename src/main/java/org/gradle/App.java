package org.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.SpringHandlerInstantiator;

import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
	
	//http://stackoverflow.com/questions/28393599/autowiring-in-jsondeserializer-springbeanautowiringsupport-vs-handlerinstantiat
	@Bean
	public HandlerInstantiator handlerInstantiator(ApplicationContext applicationContext) {
	    return new SpringHandlerInstantiator(applicationContext.getAutowireCapableBeanFactory());
	}
	
}
