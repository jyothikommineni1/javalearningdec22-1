package com.sira.learning.javalearningdec22.jyothi;

import java.util.Scanner;

public class foorloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
        String str=sc.next();
        //sc.close(); //String str="java";
           char[] charArray=str.toCharArray();
           StringBuilder sb=new StringBuilder();
           for(int i=charArray.length-1;i>=0;i--)
           {
        	   sb.append(charArray[i]);
        	   
        	   
           }
           System.out.println("reversed string:"+sb.toString());
	}

}
