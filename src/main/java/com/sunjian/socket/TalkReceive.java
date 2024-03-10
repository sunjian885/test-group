package com.sunjian.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    private DatagramSocket socket;
    private int port;
    private String msgFrom;

    public TalkReceive(int port,String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
        try {
            socket = new DatagramSocket(this.port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            //接收消息
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            try {
                socket.receive(packet);//阻塞式接收包裹
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] data = packet.getData();
            String receiveData = new String(data,0,packet.getLength());
            System.out.println(msgFrom + ":"+receiveData);
            //断开连接
            if(receiveData.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
