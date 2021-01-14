public class Methods {
    /**
     * 方法格式
     * 修饰符 方法返回值类型（如果没有返回值，则为void） 方法名（参数列表）
     * return 返回值
     * @param args
     */
    public static int add (int num1, int num2) {
        int sum = 0;
        sum += num1;
        sum += num2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(10, 20));
    }
}