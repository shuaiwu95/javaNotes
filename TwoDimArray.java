import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        // 定义二维数组
        int[][] arr = new int[3][];
        int[] a1 = {1, 2, 3};
        arr[0] = a1;
        arr[1] = new int[]{4, 5, 6};
        arr[2] = new int[]{9, 10};

        System.out.println(Arrays.toString(arr[0]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}