package com.wipro.day03;
import java.util.Scanner;
public class Assign1 {
	static public void main(String... pra) {
		Scanner tin=new Scanner(System.in);
		System.out.println("Enter a number:");
		int p=tin.nextInt();
		if((p*p)%2==0) {
			System.out.println("The square of "+p+" is "+(p*p)+" which is an even number...");
		}else {
			System.out.println("The square of "+p+" is "+(p*p)+" which is an odd number...");
		}if((p*p*p)%2==0) {
			System.out.println("The cube of "+p+" is "+(p*p*p)+" which is  an even number...");
		}else {
			System.out.println("The cube of "+p+" is "+(p*p*p)+" which is an odd number...");
		}
	}
}
