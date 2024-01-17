package org.async.util;

import org.apache.commons.lang3.time.StopWatch;

import static java.lang.Thread.sleep;
import static org.async.util.LoggerUtil.log;

public class CommonUtil {
    public static StopWatch  stopWatch = new StopWatch();

    public static void startTimer() {
        stopWatch.start();
    }

    public static void timeTaken() {
        stopWatch.stop();
        log("Total time taken: " + stopWatch.getTime());
    }

    public static void resetTimer() {
        stopWatch.reset();
    }


    public static void delay(long delayMS) {
        try{
            sleep(delayMS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
