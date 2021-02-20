package com.web.usuario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("ApRestTemplate")
	public RestTemplate RestTemplateConfig() {
		return new RestTemplate();
	}
}
