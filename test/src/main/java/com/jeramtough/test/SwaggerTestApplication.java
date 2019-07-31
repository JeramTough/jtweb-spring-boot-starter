package com.jeramtough.test;

import com.jeramtough.jtlog.facade.L;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerTestApplication.class, args);
		L.p("Success boot , http://127.0.0.1:8088/jtweb/swagger-ui.html");
	}

}
