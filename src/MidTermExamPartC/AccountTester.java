/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package MidTermExamPartC;

import java.util.Scanner;
import MidTermExamPartC.Account.AccountType;

/**
 *
 * @author 
 */
public class AccountTester {
    public static Scanner input;
    
    /* Add your code here */
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		createAccount(input);
	}
	
	public static void createAccount(Scanner input) {
		
		System.out.println("Welcome to account creation function!");
		
		String userName = InqUserName(input);
		System.out.println();
		AccountType accountType = InqAccountType(input);
		System.out.println();
		
		Account newAccount = new Account(userName, accountType);
		
		System.out.println();
		System.out.println("Your account:");
		System.out.println(newAccount);
	}
	
	private static String InqUserName (Scanner input) {
		System.out.print("Please enter your name:");
		
		return input.nextLine();
	}
	
	private static AccountType InqAccountType (Scanner input) {
	
		AccountType accountType = null;
		
		// message to ask account type
		System.out.println("Please enter the account type "
				+ "according to the following list: "
				+ "(Please enter completely same as shown)");
		for(AccountType type: AccountType.values()) {
			System.out.println(type);
		}
		System.out.print("Your account type:");
		
	
		try {
			accountType = AccountType.valueOf(input.next());
		} catch(IllegalArgumentException e) {
			System.out.println(
					"The account type input not in the list, "
					+ "please enter again.");
			input.nextLine();
			InqAccountType(input);
		}
		
		return accountType;
	}
	
}