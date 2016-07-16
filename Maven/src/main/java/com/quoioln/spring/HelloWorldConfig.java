/**
 * 
 */
package com.quoioln.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author quoioln
 *
 */
@Configuration
public class HelloWorldConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public HelloWorld helloworld() {
		return new HelloWorld();
	}
}
