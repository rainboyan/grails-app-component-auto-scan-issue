package com.rainboyan.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import groovy.transform.CompileStatic

@CompileStatic
@Configuration
class AppConfig {
    @Bean
    def demoBean() {
        new DemoBean(name: 'demo')
    }
}