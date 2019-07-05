package com.java4s.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
;

@Configuration
@EnableWebMvc
public class ApplicationWebMvcConfig extends WebMvcConfigurerAdapter{
	
	@Override
	 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
	
	@Bean
	public InternalResourceViewResolver viewResource()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/jsp/");
		resolver.setSuffix(".jsp");
        return resolver;
		
		
	}
}
