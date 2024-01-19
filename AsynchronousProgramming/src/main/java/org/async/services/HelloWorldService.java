package org.async.services;

import static org.async.util.CommonUtil.delay;
import static org.async.util.LoggerUtil.log;

public class HelloWorldService {
    public String helloWorld() {
        delay(1000);
        log("Inside helloworld");

        return "hello world";
    }
}
