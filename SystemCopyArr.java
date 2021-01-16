import java.util.Arrays;
public class SystemCopyArr {
    public static void main(String[] args) {
        // 复制数组到目标数组
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 1, arr2, 4, 4);
        System.out.println(Arrays.toString(arr2));
    }
}