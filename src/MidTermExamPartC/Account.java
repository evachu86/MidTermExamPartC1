/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidTermExamPartC;

/**
 *
 * @author 
 */
public class Account {
    
 
    private String userName;//the userID
    private String accountNum; // account number
//    private String accountType;// the user's account type
    private AccountType accountType;// the user's account type
//    public final static String [] account_types={"Checking","CC","StudentLoan"};
    public enum AccountType {Checking, Cc, StudentLoan, YiwenStudentAccount};

    /**
     * A constructor that takes in the userName and the Account type
     *
     * @param chosenName the ID to assign to this user
     * @param chosenType the users account type
     */
    public Account(String chosenName,AccountType chosenType) {
        userName = chosenName;
        accountType = chosenType;
        accountNum= "A-"+(int)(1000+Math.random()*9000);
    }

    /**
     * A getter for the userName
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    
     public String getAccountNum() {
        return accountNum;
    }


    /**
     * @param userName the userName to set
     */
    public void setUserID(String name) {
        userName = name;
    }

    /**
     * A getter for the Account Type
     *
     * @return the type
     */
	public AccountType getAccountType() {
		return accountType;
	}
//    public String getAccountType() {
//        return this.AccountType;
//    }
	

    /**
     * @param genre the genre to set
     */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
//    public void setAccountType(String type) {
//        this.AccountType = type;
//    }

	@Override
	public String toString() {
		
		String pattern = "%-12s  %-15s  %-20s";
		return String.format(pattern, 
				"Account No.", "User name", "Account Type") 
				+ "\n=================================================\n"
				+ String.format(pattern, 
						accountNum, userName, accountType.name());
	}
	
	

//end class
   
}