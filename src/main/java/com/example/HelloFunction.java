package com.example;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

import java.util.Optional;

public class HelloFunction {
    @FunctionName("helloFunction")
    public HttpResponseMessage run(
        @HttpTrigger(name = "req", 
                     methods = {HttpMethod.GET}, 
                     authLevel = AuthorizationLevel.ANONYMOUS) 
        HttpRequestMessage<Optional<String>> request,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java HTTP trigger processed a request.");
        return request.createResponseBuilder(HttpStatus.OK)
                      .body("Hello from Azure Function!")
                      .build();
    }
}
