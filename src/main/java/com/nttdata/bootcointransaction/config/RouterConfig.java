package com.nttdata.bootcointransaction.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.nttdata.bootcointransaction.handlers.TransactionHandler;

@Configuration
public class RouterConfig {
  @Bean
  public RouterFunction<ServerResponse> routes(TransactionHandler handler) {
    return route(POST("/api/bootcoin-transaction"), handler::createTransaction)
        .andRoute(GET("/api/bootcoin-transaction"), handler::findAll)
        .andRoute(DELETE("/api/bootcoin-transaction/{id}"), handler::delete);
  }
}
