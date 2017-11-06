package com.offcn.test;

import com.offcn.HelloWebservice;
import com.offcn.HelloWebserviceService;
/**
 * javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
 * @author ibm
 *
 */
public class AppStart {

	public static void main(String[] args) {
		HelloWebservice hello=new HelloWebserviceService().getPort(HelloWebservice.class);

		//java git
		
		
		System.out.println(hello.getHello("ÂíÁ¦"));
	}

}
