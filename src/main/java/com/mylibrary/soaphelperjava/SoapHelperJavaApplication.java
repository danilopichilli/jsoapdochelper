package com.mylibrary.soaphelperjava;

import com.jsoapdoc.soaplib.annotation.EnableSoapDocs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableSoapDocs
@ComponentScan(basePackages = "com.jsoapdoc.soaplib")
public class SoapHelperJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapHelperJavaApplication.class, args);
	}

}
