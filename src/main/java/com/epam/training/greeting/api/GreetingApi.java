package com.epam.training.greeting.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags = "Greeting Api")
@RequestMapping("/greeting")
public interface GreetingApi {

  @GetMapping
  @ApiOperation(value = "Greet")
  @ApiResponse(code = 200, message = "OK", response = String.class)
  String greet(@RequestParam(defaultValue = "Anonymous") String name) throws UnknownHostException;
}
