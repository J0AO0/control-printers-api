package com.gralha.controlprinters;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;


@SpringBootApplication
public class ControlPrintersApplication {

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Authorization","Content-Type","Accept", "Key"));
//		config.setAllowedHeaders(Arrays.asList("Authorization","Content-Type","Accept"));
		config.addAllowedMethod("*");
		config.setMaxAge(3600L);
		config.setAllowedOrigins(Arrays.asList("http://localhost","http://localhost:4200","http://192.168.11.2:4200","http://localhost:4202","https://grmannager.com.br","https://hml.grmannager.com.br","https://grmannager.com.br"));

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);

		return new CorsFilter(source);
	}


	public static void main(String[] args) {
		SpringApplication.run(ControlPrintersApplication.class, args);
	}

}
