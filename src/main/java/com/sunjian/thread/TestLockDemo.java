package com.sunjian.thread;

import java.util.concurrent.locks.ReentrantLock;

public class TestLockDemo {
    public static void main(String[] args) {
        Test001 test = new Test001();
        new Thread(test).start();
        new Thread(test).start();
        new Thread(test).start();
    }

}

class Test001 implements Runnable{
    int number = 10;
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            if(number>0){
                try{
                    lock.lock();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(number--);
                }finally {
                    lock.unlock();
                }
            }else {
                break;
            }
        }
    }
}
