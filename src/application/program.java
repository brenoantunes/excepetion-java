package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();
		sc.nextLine();
	
		Account account = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		
		try {			
			account.withdraw(sc.nextDouble());
			System.out.print("New balance: " + account.getBalance());
		}
		
		catch (DomainException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
