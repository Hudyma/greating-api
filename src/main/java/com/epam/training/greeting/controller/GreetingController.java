package com.epam.training.greeting.controller;

import com.epam.training.greeting.api.GreetingApi;
import com.epam.training.greeting.util.HostnameUtils;
import java.net.UnknownHostException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GreetingController implements GreetingApi {

  @Override
  public String greet(String name) throws UnknownHostException {
    String hostDetails = HostnameUtils.getLocalAddress();

    log.info("greet: greetings to {}. Host details: {}", name, hostDetails);

    return String.format("Hello %s \n%s", name, hostDetails);
  }
}
