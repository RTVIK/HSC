package com.file;

import java.util.Scanner;

public class FileStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Admin");
		System.out.println("2. User");
		int n = sc.nextInt();
		switch(n) {
		//Admin 
		case 1: 	System.out.println("1. Login");
					System.out.println("2. Forgot Password");
					int a = sc.nextInt();
					switch(a) {
					case 1:		//Login l = new Login();
								break;
					
					case 2: 	//Forg_Pass fp = new Forg_Pass();
								break;
					}
					
					break;
					
		//User			
		case 2:		System.out.println("1. Login");
					System.out.println("2. Register");
					System.out.println("3. Forgot Password");
					int c = sc.nextInt();
					switch(c) {
					case 1:		//Login l = new Login();
								break;
					
					case 2:		Register r = new Register();
								r.register();
								break;
							
					case 3:		//Forg_Pass fp = new Forg_Pass();
								break;
					}
					
					break;
		}

	}
}
