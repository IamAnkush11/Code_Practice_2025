package com.springboot1.springBoot1;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	
	@Override
	public void compile() {
		System.out.println("Compiling using Desktop");
	}
}