package dev.team4.portfoliotracker.services;

import dev.team4.portfoliotracker.models.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getAllTransactions(int userId);
    Transaction getTransactionById(int transactionId);
    List<Transaction> getTransactionsByDate(long date);
    Transaction addTransaction(int userId, double shareAmount, double sharePrice, String note, long date);
    void updateTransaction(int transactionId, int userId, double shareAmount, double sharePrice, String note, long date);
    void deleteTransaction(int transactionId, int userId);
}
