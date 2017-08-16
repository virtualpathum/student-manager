package com.lk.student.manager.web.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;


// TODO: Auto-generated Javadoc
/**
 * The Class WebMvcConfig.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.lk.meeting.room.web" })
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	
	/**
	 *  (non-Javadoc).
	 *
	 * @param configurer the configurer
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	/**
	 *  (non-Javadoc).
	 *
	 * @param converters the converters
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureMessageConverters(java.util.List)
	 */
	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		converters.add(mappingJackson2HttpMessageConverter());
		converters.add(stringHttpMessageConverter());
		super.configureMessageConverters(converters);
	}

	/**
	 * Mapping jackson 2 http message converter.
	 *
	 * @return the mapping jackson 2 http message converter
	 */
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();

		builder.serializationInclusion(Include.NON_NULL);
		builder.featuresToDisable(
				DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		builder.featuresToEnable(
				DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		builder.defaultViewInclusion(Boolean.TRUE);

		return new MappingJackson2HttpMessageConverter(builder.build());
	}
	
	/**
	 * String http message converter.
	 *
	 * @return the string http message converter
	 */
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		return new StringHttpMessageConverter();
	}


}
