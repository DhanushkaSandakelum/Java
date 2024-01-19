package org.async.completablefuture;

import org.async.services.HelloWorldService;
import java.util.concurrent.CompletableFuture;

import static org.async.util.CommonUtil.delay;
import static org.async.util.LoggerUtil.log;

public class CompletableFutureExample {
    public static void main(String[] args) {
        HelloWorldService helloWorldService = new HelloWorldService();

        CompletableFuture.supplyAsync(()->helloWorldService.helloWorld())
                .thenAccept((result) -> {
                    log("Result: " + result);
                })
                .join();

        log("Done");
//        delay(2000);
    }
}
