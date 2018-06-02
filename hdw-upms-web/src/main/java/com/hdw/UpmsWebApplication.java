package com.hdw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 
 * @description Application
 * @author TuMinglong
 * @date 2017年9月5日下午8:55:08
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableAsync
@EnableScheduling
public class UpmsWebApplication extends SpringBootServletInitializer {

	protected final static Logger logger = LoggerFactory.getLogger(UpmsWebApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("----UpmsWebApplication 启动----");
		return application.sources(UpmsWebApplication.class);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(UpmsWebApplication.class, args);
		logger.info("----UpmsWebApplication 启动----");
	}

}
