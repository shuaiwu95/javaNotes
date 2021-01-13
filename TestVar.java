import java.util.Scanner;

public class TestVar {
    public static void main(String[] args) {
       // 声明变量
       // JAVA为强类型语言，只要声明变量就必须定义类型
        int age = 10; // 定义一个整数类型age
        // System.out.println(age); // 10
        // byte 一字节 = 8位 01111111 转化为十进制位127 所以byte右边界位127
        int age1 = 16; // 10进制
        int age2 = 016; // 8进制
        int age3 = 0x16; // 16进制
        int age4 = 0b10; // 2进制
        /*
        System.out.println(age1); // 16 
        System.out.println(age2); // 14
        System.out.println(age3); // 22
        System.out.println(age4); // 2
        */
        // long类型
        long age5 = 10000000000000L; // long 必须加 L
        // System.out.println(age5); // 10000000000000
        // 浮点类型 float 4字节 double 8字节

        // 10进制形式
        double num = 3.14;
        // 科学计数法
        double num2 = 314E-2;
        // 浮点数默认都是double类型，如果想用float，后边必须加F
        float num3 = 3.141592654F;
        // System.out.println(num3); // 3.1415927

        //字符型在内存中占2个字节 （单引号） 赋值内容为单个字符或者单个转义字符
        char ch1 = 'a';
        char ch2 = '\n';
        char ch3 = '中'; // 只能单个字符也不许空单引号
        // System.out.println(ch3); // 中
        
        //布尔类型
        boolean flag = true;
        // System.out.println(flag); // true

        // 数据类型转换
        // int 可以转 double , double无法转int=》可强制转换，但是会掉精度
        double d = 6;
        // System.out.println(d); // 6.0
        int i = (int)6.5;
        // System.out.println(i); // 6
        double d2 = 12 + 1249L + 8.5F + 3.81 + 'a';
        // System.out.println(d2); // 1370.31
        // 类型级别 从低到高 byte short char -> long -> float -> double
        // 运算时，所有类型将转为级别最高的进行运算
        // 如果定义的类型不是级别最高的，可以进行强转
        int d3 = (int)(12 + 1249L + 8.5F + 3.81 + 'a');
        // System.out.println(d3); // 1370

        // 有种特殊类型，对于 byte short char 只要在他们表数范围内，赋值的时候就不需要进行强转，如果超出了就必须进行强转。

        // 字符串转字符
        String sexStr = "男性";
        char sexChar = sexStr.charAt(0);
        System.out.println(sexChar);
        
        // 练习，求圆的周长和面积
        final double PI = 3.1415926; // final 修饰不可改变的量，也就是常量，字符常量;约定成俗，字符常量要大写；
        // 实例化一个扫描器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        // 扫描录入的数据
        int r = sc.nextInt();
        // 1. 求周长
        double c = 2 * PI * r;
        System.out.println("周长：" + c);
        // 2. 求面积
        double s = PI * r * r;
        System.out.println("面积：" + s);
        sc.close();
    }
}