package com.qdgl.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/24 0024
 * @Description: com.qdgl.iterator
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 迭代器 Iterator 是一个接口（Interface）
        // 必须实现的方法
        // hasNext next remove
        // 统一的来遍历 collection 对象的方法
        Collection c = new HashSet();
        c.add(new Integer(10));
        c.add(new Integer(20));
        c.add(new Integer(30));
        c.add(new Integer(40));
        c.add(new Integer(50));
        Iterator i = c.iterator();
        while (i.hasNext()) {
            int item = (int) i.next();
            if (item > 20) {
                i.remove();
            }
            System.out.println(item);
        }
        System.out.println(c.toString()); // 20 10
    }
}
