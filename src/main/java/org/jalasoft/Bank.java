package org.jalasoft;

import java.util.HashMap;
import java.util.Set;

/**
 * Bank
 */
public class Bank {

    /**
     * Key: represent the account number
     * Value: represent the balance
     */
    private HashMap<Integer, Integer> accounts;


    private int nextAccount;
    private double interestRate;

    public Bank() {
        accounts = new HashMap<>();
        nextAccount = 0;
        interestRate = 0.01;
    }

    /**
     * Create a new account and assign it an account number and sets the balance to 0
     * 
     * @return The account number
     */
    public int newAccount() {
        int currentAccount = nextAccount++;
        accounts.put(currentAccount, 0);    
        return currentAccount;
    }

    /**
     * Given an account number it will search for the BankAccount instance
     *  - If the accountNumber does not exist it wil return 'null' 
     * 
     * TODO: Analyse NullObjectPattern to avoid nulls
     * 
     * @param accountNumber the account number to find the BankAccountInstance
     * @return a instance of BankAccount
     */
    public BankAccount getBankAccount(int accountNumber) {
        return null;
    }

    /**
     * This method deposit a certain amount of money to all accounts based on a
     * interest rate
     * 
     * @return whether the interest payment process was successful or not
     * 
     * TODO: Implementation is very unefficient
     */
    public boolean payInterest() {
        Set<Integer> accountNumbers = accounts.keySet();
        
        for (int accountNumber : accountNumbers) {
            int newBalance = (int) (accounts.get(accountNumber) * (1 + interestRate));
            accounts.put(accountNumber, newBalance);
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Set<Integer> accountNumbers = accounts.keySet();
        builder.append("The bank has ").append(accountNumbers.size()).append(" accounts.");
        for (int accountNumber : accountNumbers) {
            builder
                .append(System.lineSeparator())
                .append("\tAccount ").append(accountNumber)
                .append(": balance=").append(accounts.get(accountNumber));
        }

        return builder.toString();
    }  
}