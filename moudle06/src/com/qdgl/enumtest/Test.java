package com.qdgl.enumtest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/24 0024
 * @Description: com.qdgl.enumtest
 * @Version: 1.0
 */
public class Test {
    public enum MyColor {red, green, blue};
    public static void main(String[] args) {
        // 枚举类型
        MyColor m = MyColor.red;
        switch (m) {
            case red:
                System.out.println("red");
                break;
            case green:
                System.out.println("green");
                break;
            case blue:
                System.out.println("blue");
                break;
            default:
                System.out.println("default");
        }
    }
}
