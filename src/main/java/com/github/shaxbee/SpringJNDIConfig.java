package com.github.shaxbee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.shaxbee")
public class SpringJNDIConfig {

    @Bean 
    static public BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new BeanFactoryPostProcessor() {
            @Override
            public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
                final CommonAnnotationBeanPostProcessor processor = new CommonAnnotationBeanPostProcessor();
                processor.setAlwaysUseJndiLookup(true);
                beanFactory.addBeanPostProcessor(processor);
            }
        };
    }
}
