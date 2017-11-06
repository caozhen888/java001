package com.ooo.aaa;

public class Test {

	public static void main(String[] args) {
		PhoneService phone=new PhoneServiceImplService().getPhoneServiceImplPort();
		Phone m=phone.findByNumber("1836668");
        System.out.println(m.getArea()+" "+m.getAreacode());
	}

}
