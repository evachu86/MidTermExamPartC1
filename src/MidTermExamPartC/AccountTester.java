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
		
		Account newAccount = createAccount(input);
		
	}
	
	public static Account createAccount(Scanner input) {
		
		System.out.println("Welcome to account creation function!");
		System.out.print("Please enter your name:");
		
		String userName = InqUserName(input);
		AccountType accountType = InqAccountType(input);
		
		return new Account(userName, accountType);
	}
	
	private static String InqUserName (Scanner input) {
		System.out.print("Please enter your name:");
		
		return input.nextLine();
	}
	
	private static AccountType InqAccountType (Scanner input) {
		
		System.out.println("Please enter the account type "
				+ "according to the following list: "
				+ "(Please enter completely same as shown)");
		for(AccountType type: AccountType.values()) {
			System.out.println(type);
		}
		System.out.print("Your account type:");
		
		return AccountType.valueOf(input.next());
	}
	
}