package org.jalasoft;

/**
 * 
 */
public class BankAccount {

 
    /**
     * @param accountNumber the unique identifier for a bank account
     * @param AccountOrigin represent where the account was created
     */
    public BankAccount(int accountNumber, AccountOrigin AccountOrigin) {
        
    }

    /**
     * @return the unique identifier of the account
     */
    public int getAccountNumber() {
        return 0;
    }

    /**
     * Return the current balance of a given account
     * 
     * @return the balance of the given account
     */
    public int getBalance() {
        return 0;
    }

    /**
     * @return the origin where the account was created
     */
    public AccountOrigin getAccountOrigin() {
        return null;
    }

    /**
     * This increase the amount of the balance applying the following restrictions:
     * 
     * @param amount the amount that will be increased
     */
    public boolean deposit(int amount) {

        return false;
    }

    /**
     * Will check if the amount can be supported by the current balance
     * 
     * <<explain how the check will be performed>>
     * 
     * @param amount the amount to check
     * @return wether the amount is supported or not
     */
    public boolean hasEnoughCollateral(int amount) {

        return false;
    }


    /**
     * This decrease the amount of the balance applying the following restrictions:
     * - The amount cannot be greater than the current balance
     * 
     * @param amount the amount that will be decrease
     */
    public boolean withdraw(int amount) {

        return false;
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