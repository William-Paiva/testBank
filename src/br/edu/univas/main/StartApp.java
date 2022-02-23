package br.edu.univas.main;

import java.util.Scanner;
import br.edu.univas.classes.Account;

public class StartApp {

	public static void main(String[] args) {
		Account account = new Account();
		int option;
		
		do {
			
			option = menu();
			
			switch(option) {
			
			case(1):account.openAccount();break;
			case(2):account.showAccount();break;
			case(3):account.removeAccount();break;
			
			}
		}while(option!=9);
			System.out.println("Exit System...");
	}
	
	public static int menu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n===Bank of America===\n");
		System.out.println("Chose one of these options:\n ");
		System.out.println("1.New Account");
		System.out.println("2.Show account status");
		System.out.println("3.Delete account");
		System.out.println("9.Exit");
	    return scanner.nextInt();	    	    	    
	}


}
