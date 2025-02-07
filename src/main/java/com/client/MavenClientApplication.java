package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.buildmaven.add.Sum;

@SpringBootApplication
public class MavenClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenClientApplication.class, args);

		Sum sum = new Sum();

		int addition = sum.addition(10, 15);
		System.out.println("Addition " + addition);
	}

public String qaMethod()
{
return "BikkadIT";

	public String devMethod() {

		return "this is developer";

	}
}
