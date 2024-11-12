package com.zosh.service;

import com.zosh.model.Order;
import com.zosh.model.Seller;
import com.zosh.model.Transaction;
import com.zosh.model.User;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
