public class Method01 {
    public static void main(String[] args) {
        // method01(10);
        // method01();
        method01(20, 30, 40);
        // method01(new int[]{11, 12, 13});
    }
    /**
     * 可变参数
     * 解决部分方法重载问题
     * 平时开发中建议不要使用可变参数！
     * @param num
     */
    public static void method01 (int num2, int...num) {
        for (int i : num) {
            System.out.print(i + "\t");
        }
        System.out.println(num2);
    }
}