package com.nvrsk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AnyUtil {

    private static final Logger log = LoggerFactory.getLogger(AnyUtil.class);

    private AnyUtil() {
    }

    public static int sum(int a, int b) {
        log.info("The sum function was invoked with a={} and b={}", a, b);
        int result = a + b;
        log.info("The sum of a={} and b={} was successfully calculated: {}", a, b, result);
        return a + b;
    }
}
