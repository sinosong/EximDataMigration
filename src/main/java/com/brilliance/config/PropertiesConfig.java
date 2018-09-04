package com.brilliance.config;

import com.brilliance.context.PropertyPlaceholder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropertiesConfig {
//    @Bean
//    public CustomPropertyConfigurer propertyConfigurer(){
//        CustomPropertyConfigurer configurer = new CustomPropertyConfigurer();
//        ClassPathResource[] resources = new ClassPathResource[]{new ClassPathResource("config.properties")};
//        configurer.setLocations(resources);
//        return configurer;
//    }
    @Bean
    public PropertyPlaceholder propertyPlaceholder(){
        PropertyPlaceholder placeholder=new PropertyPlaceholder();
        ClassPathResource[] resources = new ClassPathResource[]{new ClassPathResource("config.properties")};
        placeholder.setLocations(resources);
        return placeholder;
    }
}
