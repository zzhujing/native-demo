package com.example.nativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class NativeDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(NativeDemoApplication.class, args);
  }

  @Bean
  RouterFunction<ServerResponse> routerFunction() {
    return RouterFunctions.route()
      .GET("/",req->ServerResponse.ok().bodyValue("success"))
      .build();
  }

}
