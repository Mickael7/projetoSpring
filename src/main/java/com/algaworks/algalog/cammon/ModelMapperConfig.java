package com.algaworks.algalog.cammon;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMpapper() {
		return new ModelMapper();
		
	}
	
	
	
}
