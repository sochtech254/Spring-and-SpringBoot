package com.sochtech.banking.service;

import com.sochtech.banking.dto.AccountDto;

import java.util.List;

public interface AccountService
{
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccountById(Long id);
}
