package com.qdgl.test3;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.test3
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy(30, "鹿晗");
        Girl girl = new Girl("关晓彤", 100);
        girl.love(boy);
        /*我男朋友的名字:鹿晗
        我男朋友的年龄:30
        跟我谈恋爱给你买买买*/
        girl.m = new Mum();
        girl.weChart();
        // 妈妈唠唠叨叨都是爱,听妈妈的话。
    }
}
