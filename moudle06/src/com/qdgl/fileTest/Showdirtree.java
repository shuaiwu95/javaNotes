package com.qdgl.fileTest;

import java.io.File;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/24 0024
 * @Description: com.qdgl.fileTest
 * @Version: 1.0
 */
public class Showdirtree {
    // 展示文件树
    // 思路：递归
    public static void main(String[] args) {
        File f = new File("E:/学习资料/3. java学习/javaNotes");
        tree(f,0);
    }

    private static void tree (File f, int leve) {
        // 添加缩进空格
        String preStr = "";
        for (int i = 0; i < leve; i++) {
            preStr += "  ";
        }
        // 获取子目录数组
        File[] childs = f.listFiles();
        for (int i = 0; i < childs.length; i++) {
            System.out.println(preStr + childs[i].getName());
            if (childs[i].isDirectory()) { // 如果是目录，继续找其子目录
                tree(childs[i], leve + 1);
            }
        }
    }
}
