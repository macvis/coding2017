package ocp.refactored.impl;

import ocp.refactored.Logger;

/**
 * Created by Tee on 2017/6/23.
 */
public class DateLog implements Logger{
    @Override
    public void log(String msg) {
        String logMsg = getCurrentDateAsString() + ": " + msg;
        System.out.println("logMsg -> " + logMsg);
    }

    private String getCurrentDateAsString(){
        return "";
    }
}
