package com.wipro.day03;
import java.util.Scanner;


public class Assign2 {
	 private static final String uname = "admin";
	    private static final String passw = "admin123";
	    private static final int ma = 3;

	static public void main(String... pra) {

		
		   
		        Scanner tin = new Scanner(System.in);
		        int attempts = 0;

		        while (attempts < ma) {
		            System.out.print("Enter username: ");
		            String iuname = tin.nextLine();
		            System.out.print("Enter password: ");
		            String ipassw = tin.nextLine();

		            if (uname.equals(iuname) && passw.equals(ipassw)) {
		                System.out.println("Login successful...");
		                break;
		            } else {
		                attempts++;
		                System.out.println("Invaid credentials.Attempts left: " + (ma - attempts));
		            }
		        }

		        if (attempts == ma) {
		            System.out.println("Account locked...");
		        }

		        tin.close();
		    
		

	}
}
