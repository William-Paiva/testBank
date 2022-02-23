package br.edu.univas.classes;

import java.util.Scanner;

public class Account {
	
	Scanner scanner = new Scanner(System.in);
	Address aD = new Address();
	private int count = 0;
	private int cpf[] = new int[10];
	private String name[] = new String[10];
	
		
	public void setCpf(int cpf) {		
		this.cpf[count] = cpf;		
	}	
	public void setName(String name) {		
		this.name[count] = name;
	}
	
	
	public void openAccount() {						
		System.out.println("Enter the client's Cpf number: ");
		int cpf = scanner.nextInt();
		if(checkCpf(cpf)) {
			System.out.println("This account already exist!!!");
			
		}else {
		setCpf(cpf);
		scanner.nextLine();
		System.out.println("Enter the client's name: ");
		String name = scanner.nextLine();
		setName(name);
		System.out.println("Enter the client's street name: ");
		String ad = scanner.nextLine();
		aD.setStreet(ad, count);
		System.out.println("Enter the client's house number: ");
		int nb = scanner.nextInt();
		aD.setNumber(nb, count);	
		count++;	
		}
	}
	
	public void showAccount() {	
		System.out.println("Enter the client's Cpf number: ");
		int cpfCheck = scanner.nextInt();		
		if(checkCpf(cpfCheck)) {
			int j = checkCpf2(cpfCheck);
			System.out.println("\n===Show Account Status===\n");		
			System.out.println("CPf: "+cpf[j]);
			System.out.println("Name: "+name[j]);
			System.out.println("Address: "+aD.getNumber(j)+", "+aD.getStreet(j));
		}else {
			System.out.println("this account doesn't exist!");
		}
	}
	
	public boolean checkCpf(int check) {
		for(int i=0; i<count; i++) {
			if(check==cpf[i]) {
				return check==cpf[i];
			}
		}return false;
	}
	
	public int checkCpf2(int check) {
		for(int i=0; i<count; i++) {
			if(check==cpf[i]) {
				return i;
			}
		}return 0;
	}
	
	public void removeAccount() {
		System.out.println("Enter the client's Cpf number: ");
		int cpfCheck = scanner.nextInt();
		
			if(checkCpf(cpfCheck)) {
				int j = checkCpf2(cpfCheck);
				System.out.println("Removing this account: ");		
				System.out.println("CPf: "+cpf[j]);
				System.out.println("Name: "+name[j]);
				System.out.println("Address: "+aD.getNumber(j)+", "+aD.getStreet(j));
				if(j<count) {
					for(int i=j; i<count; i++) {
						cpf[i] = cpf[i+1];
						name[i] = name[i+1];
					}
					count--;
					}else {
						System.out.println("this account doesn't exist!");
					}
				}
			}	
	}
	

