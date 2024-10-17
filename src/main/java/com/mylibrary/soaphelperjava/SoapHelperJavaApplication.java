package com.mylibrary.soaphelperjava;

import io.github.jsoapdoc.annotation.EnableSoapDocs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableSoapDocs
@ComponentScan(basePackages = "io.github.jsoapdoc")
public class SoapHelperJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapHelperJavaApplication.class, args);
	}

}
