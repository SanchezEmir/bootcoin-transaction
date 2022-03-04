package com.nttdata.bootcointransaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcointransaction.entity.Transaction;
import com.nttdata.bootcointransaction.repository.TransactionRepository;
import com.nttdata.bootcointransaction.service.ITransactionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements ITransactionService {

  @Autowired
  private TransactionRepository repository;

  @Override
  public Mono<Transaction> create(Transaction o) {
    return repository.save(o);
  }

  @Override
  public Flux<Transaction> findAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Transaction> findById(String s) {
    return repository.findById(s);
  }

  @Override
  public Mono<Transaction> update(Transaction o) {
    return repository.save(o);
  }

  @Override
  public Mono<Void> delete(Transaction o) {
    return repository.delete(o);
  }
}
