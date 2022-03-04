package com.nttdata.bootcointransaction.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "transaction")
public class Transaction {
  @Id
  private String id;

  private String typeTransaction;

  private String phoneNumber;

  private Double amount;

  private Double exchange;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss ")
  private LocalDateTime createdAt = LocalDateTime.now();
}
