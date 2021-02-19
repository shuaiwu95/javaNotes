package com.qdgl.socket;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/31 0031
 * @Description: com.qdgl.socket 客户端
 * @Version: 1.0
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 6666); // 申请连结
        // 向服务端发送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello server!");

        // 接收服务端的数据
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println(dis.readUTF());
        is.close();
        dis.close();

        dos.close();

        s.close();
    }
}
