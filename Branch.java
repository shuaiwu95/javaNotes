public class Branch {
    public static void main(String[] args) {
        // 求和判断
        int num1 = 1;
        int num2 = 2;
        int sum = 0;
        sum += num1;
        sum += num2;
        System.out.println(sum);
        if (sum >= 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 随机数
        double randomDouble = Math.random();
        System.out.println(randomDouble);

        // 随机整数
        int num = (int)(Math.random() * 6 + 1);
        System.out.println(num);


        // while 1+2+3+4+5
        int num3 = 1;
        int sum2 = 0;
        while (num3 <= 5) {
            sum2 += num3;
            num3 ++;
        }
        System.out.println(sum2);

        // do while 1+2+3+4 + ... + 100
        int num4 = 1;
        int sum3 = 0;
        do {
            sum3 += num4;
            num4 ++;
        } while(num4 <= 100);
        System.out.println(sum3);

        // 什么时候用while 什么时候用do while

        // for 1+2+3+4 + ... + 100
        int sum4 = 0;
        for (int i = 1;i <= 100; i ++) {
            sum4 += i;
        }
        System.out.println(sum4);
    }
}