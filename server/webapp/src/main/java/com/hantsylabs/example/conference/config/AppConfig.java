package com.hantsylabs.example.conference.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "com.hantsylabs.example" } )
@PropertySource(value= {"classpath:/META-INF/app.properties", 
		"classpath:/META-INF/email.properties",
		"classpath:/META-INF/database.properties"})
public class AppConfig {


}
