public class TestVar {
    public static void main(String[] args) {
       // 声明变量
       // JAVA为强类型语言，只要声明变量就必须定义类型
        int age = 10; // 定义一个整数类型age
        System.out.println(age);
        // byte 一字节 = 8位 01111111 转化为十进制位127 所以byte右边界位127
        int age1 = 16; // 10进制
        int age2 = 016; // 8进制
        int age3 = 0x16; // 16进制
        int age4 = 0b10; // 2进制
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(age4);
        // long类型
        long age5 = 10000000000000L; // long 必须加 L
        System.out.println(age5);
        // 浮点类型 float 4字节 double 8字节

        // 10进制形式
        double num = 3.14;
        // 科学计数法
        double num2 = 314E-2;
        // 浮点数默认都是double类型，如果想用float，后边必须加F
        float num3 = 3.141592654F;
        System.out.println(num3); // 3.1415927
        

    }
}