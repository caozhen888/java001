package com.offcn.huigu;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		HelloWebservice001 hello=new HelloWebservice001Service().getPort(HelloWebservice001.class);

		List<String> list=hello.getList();
		
		for(String s:list){
			System.out.println("s:"+s);
		}
	}

}
