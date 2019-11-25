package org.jalasoft;

/**
 * 
 */
public class BankAccount {
    
    private int accountNumber;
    private AccountOrigin accountOrigin;
    private int balance;

 
    /**
     * @param accountNumber the unique identifier for a bank account
     * @param AccountOrigin represent where the account was created
     */
    public BankAccount(final int accountNumber, final AccountOrigin accountOrigin) {
        this.accountNumber = accountNumber;
        this.accountOrigin = accountOrigin;
        balance = 0;
    }

    /**
     * @return the unique identifier of the account
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Return the current balance of a given account
     * 
     * @return the balance of the given account
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @return the origin where the account was created
     */
    public AccountOrigin getAccountOrigin() {
        return accountOrigin;
    }

    /**
     * This increase the amount of the balance applying the following restrictions:
     * 
     * @param amount the amount that will be increased
     * @return true if the deposit was successful, false otherwise
     */
    public boolean deposit(final int amount) {
        balance += amount; 
        return true;
    }

    /**
     * Will check if the amount can be supported by the current balance
     * 
     * <<explain how the check will be performed>>
     * 
     * @param amount the amount to check
     * @return wether the amount is supported or not
     */
    public boolean hasEnoughCollateral(final int amount) {
        return balance >= amount / 2;
    }

    /**
     * This decrease the amount of the balance applying the following restrictions:
     * - The amount cannot be greater than the current balance
     * 
     * @param amount the amount that will be decrease
     */
    public boolean withdraw(final int amount) {
        boolean isWithdrawAllowed = amount <= balance;
        if (isWithdrawAllowed) {
            balance -=amount;
        }
         return isWithdrawAllowed;
    }

    /**
     * Change the account origin applying the following actions:
     * - change the limit for withdraw
     * - change the restriction for loan
     * - etc
     * 
     * @param AccountOrigin the new account origin to change, it will decide how the restriction or facilities will change
     * @return
     * 
     * DO NOT IMPLEMENT IT: STILL IN DESIGN
     */
    public boolean changeAccount(AccountOrigin AccountOrigin) {
        return false;
    }
}