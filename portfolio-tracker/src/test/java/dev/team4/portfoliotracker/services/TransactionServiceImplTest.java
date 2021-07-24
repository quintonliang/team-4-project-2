package dev.team4.portfoliotracker.services;

import dev.team4.portfoliotracker.models.Transaction;
import dev.team4.portfoliotracker.repositories.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

class TransactionServiceImplTest {

    @Mock
    TransactionRepository txnRepo;

    @Test
    void testGetAllTransactions() {
        Transaction txn1 = new Transaction(201, 5.32, 690.32, "test1", 1627009451);
        Transaction txn2 = new Transaction(202, 150.6752, 32.41, "test2", 1622009451);
        Transaction txn3 = new Transaction(203, 13500, 6490.80, "test3", 1616009451);
        List<Transaction> txns = Arrays.asList(txn1,txn2,txn3);

        doReturn(txns).when(txnRepo).findAllTransactionsByUserId(1);
    }

    @Test
    void getTransactionById() {
    }

    @Test
    void getTransactionsByDate() {
    }

    @Test
    void addTransaction() {
    }

    @Test
    void updateTransaction() {
    }

    @Test
    void deleteTransaction() {
    }
}