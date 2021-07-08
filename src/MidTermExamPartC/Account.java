/* 
 * Name: Yi-Wen Chu    991624614
 * Assignment: Midterm 
 * Program: Computer Systems Technology -
 * 	Software Development and Network Engineering
 * File: Account.java
 * Other Files in this Project: 
 * 
 * Main class: AccountTester.java
 * 
 * Date: Jul 8, 2021
 * 
 * Description: Model for storing account information.
 */

package MidTermExamPartC;

/**
 * The Class Account.
 *
 * @author
 */
public class Account {

	private String userName;// the userID
	private String accountNum; // account number
	private AccountType accountType;// the user's account type

	/**
	 * The Enum AccountType.
	 *
	 * @author Yi-Wen Chu Computer Systems Technology Software Development and
	 *         Network Engineering
	 */
	public enum AccountType {

		/** The Checking. */
		Checking("Checking"),
		/** The Cc. */
		Cc("CC"),
		/** The Student loan. */
		StudentLoan("Student Loan"),
		/** The Yiwen student account. */
		YiwenStudentAccount("Yiwen Studnet Account");

		private String showName;
		
		AccountType (String showName) {
			this.showName = showName;
		}
		
		public String getName() {
			return showName;
		}
	};

	/**
	 * A constructor that takes in the userName and the Account type.
	 *
	 * @param chosenName the ID to assign to this user
	 * @param chosenType the users account type
	 */
	public Account(String chosenName, AccountType chosenType) {
		userName = chosenName;
		accountType = chosenType;
		accountNum = "A-" + (int) (1000 + Math.random() * 9000);
	}

	/**
	 * A getter for the userName.
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Gets the account num.
	 *
	 * @return the account num
	 */
	public String getAccountNum() {
		return accountNum;
	}

	/**
	 * Sets the user ID.
	 *
	 * @param name the new user ID
	 */
	public void setUserID(String name) {
		userName = name;
	}

	/**
	 * A getter for the Account Type.
	 *
	 * @return the type
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * Sets the account type.
	 *
	 * @param accountType the new account type
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {

		String pattern = "%-12s  %-15s  %-25s";
		return String.format(pattern, "Account No.", "User name", "Account Type")
				+ "\n=================================================\n"
				+ String.format(pattern, 
						accountNum, userName, accountType.getName());
	}

//end class

}