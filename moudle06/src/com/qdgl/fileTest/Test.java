package com.qdgl.fileTest;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/24 0024
 * @Description: com.qdgl.fileTest
 * @Version: 1.0
 */
public class Test {
    // File 是在内存中创建 File 对象，不是在硬盘创建
    public static void main(String[] args) {
        // 为了兼容 linux 路径
        String separator = File.separator;
        // 文件名
        String filename = "myFile.text";
        // 目录
        String directory = "mydir1" + separator + "mydir2";
        // 创建文件对象
        File f = new File(directory, filename);
        if (f.exists()) { // 如果文件存在
            System.out.println("文件名:" + f.getAbsolutePath());
            System.out.println("文件大小：" + f.length());
        } else {
            // 创建该目录下的抽象路径名命名
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
