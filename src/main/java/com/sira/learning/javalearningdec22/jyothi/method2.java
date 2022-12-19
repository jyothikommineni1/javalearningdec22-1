package com.sira.learning.javalearningdec22.jyothi;

public class method2 {
	//with returntype withoutparameter
	public int add() {
		int x=10;
		int y=20;
		int z=x+y;
		return(z);
		
			}
	public int sub() {
		int x=10;
		int y=20;
		int z=x-y;
		return(z);
	}
	public int mul() {
		int x=10;
		int y=20;
		int z=x*y;
		return(z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          method2 ad= new method2();
          int result =ad.add();
          System.out.println(result);
          int result2=ad.sub();
          System.out.println(result2);
          int result3=ad.mul();
          System.out.println(result3);
	}

}
