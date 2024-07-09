package com.neoteric.javatddemo.service1;

import com.neoteric.javatddemo.model1.Bank;
import com.neoteric.javatddemo.model1.CreateAccount;

import java.util.UUID;

public class BankService
{
    public CreateAccount toCreateAccount(Bank customer)
    {
        CreateAccount createAccount=null;

        if(customer.age>=18 && customer.amount>=5000)
        {
            createAccount=new CreateAccount();
            createAccount.accountNumber="sbiAc/No:"+ UUID.randomUUID().toString();
            createAccount.ifscCode="sbi"+UUID.randomUUID().toString();
            createAccount.debitCardNo="ATM/no:"+UUID.randomUUID().toString();

        }
        return createAccount;
    }
}
