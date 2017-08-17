package com.lk.student.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.lk.student.manager.config.SysConfig;


@Import(SysConfig.class)
@SpringBootApplication(scanBasePackages={"com.lk.student.manager"})
public class SpringBootStudentApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentApp.class, args);
	}
}
