package com.qdgl.io;

import java.io.*;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/26 0026
 * @Description: com.qdgl.io
 * @Version: 1.0
 */
public class TestFileInputStream {
    /*
    * 读取字节流
    * */
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("E:\\学习资料\\3. java学习\\javaNotes\\moudle08\\src\\com\\qdgl\\io\\TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            e.printStackTrace();
        }

        try {
            long num = 0;
            while ((b = in.read()) != -1) {
                System.out.print((char)b);
                num ++;
            }
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
