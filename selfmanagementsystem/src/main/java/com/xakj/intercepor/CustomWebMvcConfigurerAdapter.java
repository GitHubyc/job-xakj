package com.xakj.intercepor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class CustomWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionInterceptor())
				.excludePathPatterns("/login")
				.excludePathPatterns("/entityResponsibility");
//		registry.addInterceptor(new Intercept())
//				.addPathPatterns("/**")
//				.excludePathPatterns("/*/list","/login","/index","/403","/session","/");
	}
}