package com.lss.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * java -jar xxx.jar --spring.profiles.active=prod //多环境切换
 *
 * https://git.oschina.net/shlss/SpringBoot-Learning.git
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
