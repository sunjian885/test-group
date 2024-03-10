package com.sunjian.socket;

public class TalkTeacher {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend(3333,"localhost",8888)).start();
        new Thread(new TalkReceive(2222,"学生")).start();
    }
}
