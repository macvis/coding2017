package ocp.refactored.impl;

import ocp.refactored.Logger;

/**
 * Created by Tee on 2017/6/23.
 */
public class MailLog implements Logger {
    @Override
    public void log(String msg) {
        send(msg);
    }

    private void send(String msg){
        System.out.println("msg [" + msg + "] has sent");
    }
}
