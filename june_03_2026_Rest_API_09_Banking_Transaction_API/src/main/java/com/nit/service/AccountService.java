package com.nit.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Account;
import com.nit.repo.AccountRepository;


@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    // Create Account
    public Account createAccount(Account account) {
        return repository.save(account);
    }

    // Get All Accounts
    public List<Account> getAllAccounts() {
        return repository.findAll();
    }

    // Get Account By Id
    public Account getAccountById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update Account
    public Account updateAccount(Long id, Account updatedAccount) {

        Account account = repository.findById(id).orElse(null);

        if (account != null) {
            account.setHolderName(updatedAccount.getHolderName());
            account.setAccountType(updatedAccount.getAccountType());
            account.setBalance(updatedAccount.getBalance());
            account.setBranch(updatedAccount.getBranch());

            return repository.save(account);
        }

        return null;
    }

    // Update Balance
    public Account updateBalance(Long id, Double balance) {

        Account account = repository.findById(id).orElse(null);

        if (account != null) {
            account.setBalance(balance);
            return repository.save(account);
        }

        return null;
    }

    // Delete Account
    public String deleteAccount(Long id) {

        Account account = repository.findById(id).orElse(null);

        if (account != null) {
            repository.deleteById(id);
            return "Account Deleted Successfully";
        }

        return "Account Not Found";
    }
}