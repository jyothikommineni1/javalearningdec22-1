package com.sira.learning.javalearningdec22.jyothi;


public class stringoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname="  yashsush   ";
		String lname="wonth";
		System.out.println(fname+lname);
		System.out.println("respons from concat method  " + fname.concat(lname).toUpperCase());
		
		
		System.out.println("respons from concat method  " + fname.concat(lname).toLowerCase());
		System.out.println(fname.charAt(3));
		System.out.println(fname.length());
		System.out.println(fname.codePointAt(3));
		//equals
		boolean result= fname.equals("yash");
		System.out.println(result);
		//trim
		  String result1 = fname.trim();
		  System.out.println(result1);
		  //replace
		  String result2=fname.replace('a','d' );
		  System.out.println(result2);
		 //empty 
		  boolean result3=fname.isEmpty();
		  System.out.println(result3);
		  //charat
		  
		  System.out.println(fname.charAt(2));
		  
		  //contains
		  
		  System.out.println(fname.contains(lname));
		  
		  //indexof
		  
		  System.out.println(fname.indexOf("s"));
		  //substring
		 System.out.println(fname.substring(6,8));
		 //repeat
		 System.out.println(fname.repeat(2));
		 
		 //staticstring
		 
		 int a=10,b=20;
		 System.out.println(a+b);
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		 
		 System.out.println(s1+s2);
		 
		
		
		 

	}
	

}
