package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        if(getBalance() - amountToWithdraw < 0 || getBalance() - (amountToWithdraw + 2) < 0) {
            System.out.println("Withdraw requested results in negative balance, cannot withdraw.");
            return getBalance();
        }

        super.withdraw(amountToWithdraw);

        if(getBalance() < 150) {
            System.out.println("Balance is under 150.00, 2.00 service charge applied");
            super.withdraw(2);
        }
        return getBalance();
    }
}
