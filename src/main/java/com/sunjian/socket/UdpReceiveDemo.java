package com.sunjian.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);
        while (true){
            //接收消息
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet);//阻塞式接收包裹
            byte[] data = packet.getData();
            String receiveData = new String(data,0,packet.getLength());
            System.out.println(receiveData);
            //断开连接
            if(receiveData.equals("bye")){
                break;
            }
        }
        socket.close();

    }
}
