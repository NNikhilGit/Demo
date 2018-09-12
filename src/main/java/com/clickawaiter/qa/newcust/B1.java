package com.clickawaiter.qa.newcust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B1 extends A {
	
	public ArrayList<String> test(List a) {
		System.out.println("class b");
		return null;
	}
	
	public void demo(long a) {
		System.out.println("long");
	}
	
	public void demo(Integer a) {
		System.out.println("Integer");
	}
	
	public void demo(int ...a) {
		System.out.println("int ...");
	}
	public void demo(int a,int b) {
		System.out.println("int int");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 a=new B1();
		/*ArrayList arrlist=new ArrayList();
		List list=new ArrayList();
		a.test(arrlist);*/
		
		a.demo(1);
	}
			
}
