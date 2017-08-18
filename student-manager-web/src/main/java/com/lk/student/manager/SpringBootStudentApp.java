/**
 * Created On : 17 Aug 2017
 */
package com.lk.student.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.lk.student.manager.config.SysConfig;


/**
 * @author virtualpathum
 * The Class SpringBootStudentApp.
 */
@Import(SysConfig.class)
@SpringBootApplication(scanBasePackages={"com.lk.student.manager"})
public class SpringBootStudentApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentApp.class, args);
	}
}
