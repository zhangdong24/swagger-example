package com.pansoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pansoft.controller"))
                .build();
    }
    public ApiInfo  apiInfo(){
        Contact con = new Contact("张三", "aaa.com", "");
        return new ApiInfo("swagger学习文档",
                "这是一个api文档",
                "v1.0",
                "www.baidu.com",
                con,
                "",
                "",
                new ArrayList<>()
                );
    }
}
