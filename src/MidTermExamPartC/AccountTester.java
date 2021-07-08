/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Midterm 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: AccountTester.java
 * Other Files in this Project: 
 * AccountTester.java
 * Main class: AccountTester.java
 * 
 * Date: Jul 9, 2021
 * 
 * Description: Test class for AccountTesting
 */
package MidTermExamPartC;

import java.util.InputMismatchException;
import java.util.Scanner;
import MidTermExamPartC.Account.AccountType;

/**
 * The Class AccountTester.
 *
 * @author 
 */
public class AccountTester {
    
    /** The input. */
    public static Scanner input;
    
    /* Add your code here */
	
	/**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		// Step 1: test function of Account Creation.
		createAccount(input);
	}
	
	/**
	 * Creates the account.
	 *
	 * @param input the input
	 */
	public static void createAccount(Scanner input) {
		
		System.out.println("Welcome to account creation function!");
		
		// Step 2: The user is asked to input the user's name.
		String userName = InqUserName(input);
		System.out.println();
		
		// Step 3: The user is asked to choose their account type 
		// 			from the account type list.
		AccountType accountType = InqAccountType(input);
		System.out.println();
		
		Account newAccount = new Account(userName, accountType);
		
		// Step 4: A confirmation message 
		// 		including account information is shown to the user.
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
			System.out.println((type.ordinal()+1) +". " 
									+ type.getName());
		}
		System.out.print("Your account type:");
		
	
		try {
			int inputNo = input.nextInt();
			
			switch(inputNo) {
				case 1: accountType = AccountType.Checking;
					break;
				case 2: accountType = AccountType.Cc;
					break;
				case 3: accountType = AccountType.StudentLoan;
					break;
				case 4: accountType = AccountType.YiwenStudentAccount;
					break;
				default: 
					throw new InputMismatchException
							("The input number not in the list, "
							+ "please enter again.\n");
			}
			
		} catch(InputMismatchException e) {
			String errMsg = (e.getMessage() == null)?
					"Please input the number of the account type.\n":
						e.getMessage();
			System.out.println(errMsg);
			input.nextLine();
			InqAccountType(input);
		}
		
		return accountType;
	}
	
}