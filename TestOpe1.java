public class TestOpe1 {
    public static void main(String[] args) {
        // 案例： 输出任意四位数的每位数
        int num = 2849;
        // 个位数
        int num1 = num % 10;
        System.out.println(num1);
        // 十位数
        int num2 = num / 10 % 10;
        System.out.println(num2);
        // 百位数
        int num3 = num / 100 % 10;
        System.out.println(num3);
        // 千位数
        int num4 = num / 1000 % 10;
        System.out.println(num4);
    }
}