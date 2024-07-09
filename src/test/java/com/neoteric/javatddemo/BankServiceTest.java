package com.neoteric.javatddemo;

import com.neoteric.javatddemo.model1.Address1;
import com.neoteric.javatddemo.model1.Bank;
import com.neoteric.javatddemo.model1.CreateAccount;
import com.neoteric.javatddemo.service1.BankService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class BankServiceTest {
    @Test
    public void minimumBalance() {
        Bank bank = new Bank();
        bank.name = "Tarun";
        bank.age = 22;
        bank.aadharCardNo = "AdhaarNO:" + UUID.randomUUID();
        bank.panNo = "CN" + UUID.randomUUID();
        bank.dateOfBirth = "18-07-2003";
        bank.gender = "male";
        bank.martialStatus = "single";
        bank.branchName = "KPHB";
        bank.amount = 5500;
        Address1 address1 = new Address1();
        address1.flatNo = "143";
        address1.area = "kokatpalli";
        address1.street = "KPHB";
        address1.city = "Hyderabad";
        address1.pincode = "532185";
        bank.address = address1;
        BankService bankService = new BankService();
        CreateAccount createAccount = bankService.toCreateAccount(bank);
        Assertions.assertNotNull(createAccount.debitCardNo);
    }

}
