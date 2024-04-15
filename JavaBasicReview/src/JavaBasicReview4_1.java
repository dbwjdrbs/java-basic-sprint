import java.util.Arrays;

public class JavaBasicReview4_1 {
    public static void main(String[] args) {
        // 1. 배열 생성
        int arr[] = {1,2,3,4,5,67,8,9,0,9};
        // 2. 출력
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.println(i);
        }

        String str = Arrays.toString(arr);
        System.out.println(str.indexOf("0"));
    }
}
