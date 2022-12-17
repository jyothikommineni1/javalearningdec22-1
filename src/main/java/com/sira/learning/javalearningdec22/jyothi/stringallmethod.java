package com.sira.learning.javalearningdec22.jyothi;

public class stringallmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fname="jyothi";
		String lname="amirineni";
		System.out.println(fname.concat(lname).toUpperCase());
		System.out.println(fname.concat(lname).toLowerCase());
		System.out.println(fname.charAt(3));
		System.out.println(fname.compareToIgnoreCase(fname));
		System.out.println(fname.compareTo(lname));
		System.out.println(fname.compareToIgnoreCase(lname));
		System.out.println(fname.equals(lname));
		System.out.println(fname.codePointAt(5));
		System.out.println(lname.indexOf(3));
	}

}
