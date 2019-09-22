package com.zdxh.thread.t2;

import java.util.Timer;
import java.util.TimerTask;

public class Demo5 {
    //定时器的实现
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timetask is run");
            }
        }, 0, 1000);

    }
}
