package com.sira.learning.javalearningdec22.jyothi;

import java.util.Scanner;

public class method3 {
	
	//returnvalue with parameter
	public int add(int x,int y) {
		 int z=x+y;
		 return z;

	}
	public int sub(int x,int y)
	{
		int z=x-y;
		return(z);
	}
	public int mul(int x,int y)
	{
		int z=x*y;
		return(z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method3 ad=new method3();
		int result=ad.add(10,20);
        System.out.println(result);
        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no:");
        int no=sc.nextInt();
        System.out.println("enter your name:");
        String name=sc.next();
        sc.close();
        int result2=ad.sub(20, 30);
        System.out.println(result2);
int result3=ad.mul(20,30 );
System.out.println(result3);
	}
	
}
