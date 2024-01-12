package org.async.completablefuture;

import org.async.services.HelloWorldService;

import java.util.concurrent.CompletableFuture;

import static org.async.util.LoggerUtil.log;

public class DataTransform {
    public static void main(String[] args) {
        HelloWorldService helloWorldService = new HelloWorldService();

        CompletableFuture.supplyAsync(helloWorldService::helloWorld)
                .thenApply(String::toUpperCase) // Lambda style
                .thenAccept((result) -> {
                    log("Result: " + result);
                })
                .join();

        log("Done");
    }
}
