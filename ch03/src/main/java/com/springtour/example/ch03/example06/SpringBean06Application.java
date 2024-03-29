package com.springtour.example.ch03.example06;

import com.springtour.example.ch03.domain.lifecycle.LifeCycleComponent;
import com.springtour.example.ch03.domain.lifecycle.PrintableBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBean06Application {

    public static void main(String[] args) {
        var appCtx = SpringApplication.run(SpringBean06Application.class);
        appCtx.close();
    }

    @Bean(initMethod = "init", destroyMethod = "clear")
    public LifeCycleComponent lifeCycleComponent() {
        return new LifeCycleComponent();
    }

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new PrintableBeanPostProcessor();
    }

}
