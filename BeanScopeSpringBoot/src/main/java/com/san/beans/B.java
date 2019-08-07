package com.san.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class B {

	public B() {
		super();
		System.out.println("B constructor is invoked");
	}

}