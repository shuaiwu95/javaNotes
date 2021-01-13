public class TestOpe2 {
    public static void main(String[] args) {
        int a = 5;
        a ++;
        System.out.println(a); // 6

        // 在运算中 如果 ++ 在后，先运算再+1； 如果在前，先 +1 再运算；
        int b = 5;
        int m = b ++ + 6;
        int c = 5;
        int n = ++ c + 6;
        System.out.println(m); // 5 + 6 = 11
        System.out.println(n); // 5 + 1 + 6 = 12

        // 运算符优先级 ++ > +
        int d = 5;
        System.out.println((d ++) + (d ++)); // 5 + 6 = 11
        System.out.println(d); // 7
        int e = 5;
        System.out.println((e ++) + (++ e)); // 6 + 6 = 12
        System.out.println(e); // 7
        int f = 5;
        System.out.println((++ f) + (++ f)); // 6 + 7 = 13
        System.out.println(f); // 7
    }
}