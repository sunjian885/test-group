package com.sunjian.socket;

public class TalkStudent {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend(1111,"localhost",2222)).start();
        new Thread(new TalkReceive(8888,"老师")).start();
    }
}
