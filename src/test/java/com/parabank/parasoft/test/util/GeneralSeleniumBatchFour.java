package com.parabank.parasoft.test.util;

public class GeneralSeleniumBatchFour {
    final static public int PAGE_LOAD_TIME = 30;

    public static void domStable() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
