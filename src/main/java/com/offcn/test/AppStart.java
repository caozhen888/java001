package com.offcn.test;

import com.offcn.HelloWebservice;
import com.offcn.HelloWebserviceService;

public class AppStart {

	public static void main(String[] args) {
		HelloWebservice hello=new HelloWebserviceService().getPort(HelloWebservice.class);

		
		System.out.println(hello.getHello("����"));
	}

}
