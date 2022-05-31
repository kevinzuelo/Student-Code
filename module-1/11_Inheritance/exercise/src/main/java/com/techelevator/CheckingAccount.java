package com.techelevator;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        if(getBalance() - amountToWithdraw <= -100) {
            System.out.println("Account is overdrawn by 100.00, Cannot withdraw any more.");
            return getBalance();
        }
        else if(getBalance() - amountToWithdraw < 0 && getBalance() - amountToWithdraw > -100) {
            System.out.println("Account is negative, 10.00 overdraft fee applied");
            super.withdraw(amountToWithdraw);
            super.deposit(-10);
            return getBalance();
        }
        super.withdraw(amountToWithdraw);
        return getBalance();
    }
}
