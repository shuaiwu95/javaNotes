package com.qdgl.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/31 0031
 * @Description: com.qdgl.socket 服务器端
 * @Version: 1.0
 */
public class TcpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666); // 创建一个ServerSocket，端口为6666
        while (true) {
            Socket s = ss.accept(); // 接收连结 有客户端连接它才会执行
            // 接收客户端数据
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            // 将信息回写给客户端
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("IP:" + s.getInetAddress() + "port:" + s.getPort());
            os.close();
            dos.close();

            s.close();
            dis.close();
        }
    }
}
