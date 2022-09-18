package com.lawencon.psikotest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

@Configuration
public class FreeMarkerConfig {
	
	 @Bean(name="emailConfigBean")
	    public FreeMarkerConfigurationFactoryBean getFreeMarkerConfiguration(ResourceLoader resourceLoader) {
	        FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
	        bean.setTemplateLoaderPath("classpath:/templates/");
	        return bean;
	    }

}
