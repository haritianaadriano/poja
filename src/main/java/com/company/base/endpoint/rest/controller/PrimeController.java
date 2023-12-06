package com.company.base.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {
  @GetMapping("/new-prime")
  public BigInteger probablePrime() {
    SecureRandom secureRandom = new SecureRandom();
    BigInteger prime = new BigInteger(1000, secureRandom);
    return prime;
  }
}
