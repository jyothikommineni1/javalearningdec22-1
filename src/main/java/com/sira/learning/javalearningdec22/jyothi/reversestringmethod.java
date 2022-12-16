package com.sira.learning.javalearningdec22.jyothi;

public class reversestringmethod {

	public static void main(String[] args) {
		String str="dog";
		char[] chararray=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=chararray.length-1;i>=0;i--)
		{
			sb.append(chararray[i]);
			
		}
		System.out.println("reverse string:"+sb.toString());
	}
	

}
