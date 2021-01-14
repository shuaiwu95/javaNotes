public class TestOpe3 {
    public static void main(String[] args) {
        // 位运算符
        // 1. << 左移，将数字二进制向左移动N位，右边补N个0
        System.out.println(3<<2); // 12  小规律 每次移动一位就乘以2 3*2*2  4*8最快方式 4<<3
        System.out.println(3<<5); // 3*2*2*2*2*2 = 96    总结公式 X*(2^N)
    }
}