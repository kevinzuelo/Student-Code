package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts() {
        Accountable[] accountables = new Accountable[accounts.size()];

        for (int i = 0; i < accounts.size(); i++) {
            accountables[i] = accounts.get(i);
        }
        return accountables;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip(){
        int combinedBalances = 0;

        for(Accountable accountable : accounts) {
            combinedBalances += accountable.getBalance();
        }

        if(combinedBalances >= 25000) {
            return true;
        }
        return false;
    }
}
