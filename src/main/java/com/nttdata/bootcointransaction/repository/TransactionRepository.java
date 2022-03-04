package com.nttdata.bootcointransaction.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcointransaction.entity.Transaction;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
}
