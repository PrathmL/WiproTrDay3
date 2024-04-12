package com.wipro.day03;

public class StringMethods {
	static public void main(String... pra) {
		String one="Prathm";
		String two="Pawan";
		String three=one.concat(two);
		String four=one+two;
		System.out.println("Result of concatenation of "+one+" and "+two+" is "+three);
		String revstring=new StringBuilder(three).reverse().toString();
		System.out.println("Reversed String result of "+three+" is: "+revstring);
		System.out.println("The length of "+three+" is "+three.length());
		System.out.println("the substring of "+four+" is "+four.substring(four.length()/2,));
	}
}
