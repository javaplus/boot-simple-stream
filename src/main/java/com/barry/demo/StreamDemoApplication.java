package com.barry.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
public class StreamDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamDemoApplication.class, args);
	}

	@Bean
	public Function<String, String> upperCase(){
		return value -> {
			System.out.println(value);
			return value.toUpperCase();
		};
	}

	/* @Bean
  	public Function<Flux<String>, Flux<String>> uppercase() {
    	return flux -> flux.map(value -> value.toUpperCase());
  	}
 */
}
