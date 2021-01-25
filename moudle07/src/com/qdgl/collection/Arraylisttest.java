package com.qdgl.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/24 0024
 * @Description: com.qdgl.collection
 * @Version: 1.0
 */
public class Arraylisttest {

    public static void main(String[] args) {
        // 引用Collection是为了方便引用其它容器
        // 这样下边的代码就无法使用 ArrayList 的特定方法
        Collection c = new ArrayList();
        c.add("hello");
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);
        // 且注意， remove 传 object
        // 返回布尔类型
        // 是否可以被移除的标准是 加入的值和删除的值是否 equals
        c.remove("hello");

        // 重点知识点：
        // 如果重写equals方法必须重写hasCode方法
    }
}
