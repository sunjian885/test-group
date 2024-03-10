package com.sunjian.socket;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLDown {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.baidu.com/img/flexible/logo/pc/result@2.png");
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("baidu.png");
        byte[] data = new byte[1024];
        int len;
        while ((len=inputStream.read(data))!=-1){
            fileOutputStream.write(data,0,len);//写出这个数据
        }
        fileOutputStream.close();
        inputStream.close();
        urlConnection.disconnect();
    }
}
