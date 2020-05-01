package com.nvrsk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.nvrsk.AnyUtil.sum;

public class Sl4jLog4j2Example {

    private static final Logger log = LoggerFactory.getLogger(Sl4jLog4j2Example.class);

    public static void main(String[] args) {
        log.info("The main function was started");
        System.out.println("Sum of 1 and 2 is " + sum(1, 2));
        log.info("The main function was finished");
    }
}
