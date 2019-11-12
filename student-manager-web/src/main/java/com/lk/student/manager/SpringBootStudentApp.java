/**
 * Created On : 17 Aug 2017
 */
package com.lk.student.manager;

import com.lk.student.manager.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lk.student.manager.config.SysConfig;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author virtualpathum
 * The Class SpringBootStudentApp.
 */
@Import({SysConfig.class})
@SpringBootApplication(scanBasePackages={"com.lk.student.manager"})
@EnableSwagger2
public class SpringBootStudentApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentApp.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.lk.student.manager")).build();
				//.paths(PathSelectors.any())
				//.build();
	}
}
