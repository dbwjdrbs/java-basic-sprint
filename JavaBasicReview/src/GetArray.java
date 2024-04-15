import java.util.Scanner;

// 배열을 콘솔에서 입력받는 클래스
public class GetArray {
    public static void intArray(int[] arr_name, int arr_length) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%d개의 정수를 입력해주세요.\n", arr_length);
        // 1. 정수의 값을 입력 받는다.
        for (int i = 0; i < arr_length; i++) {
            System.out.printf("정수 (%d) : ", i+1);
            arr_name[i] = scanner.nextInt();
        }
        //2. 입력된 정수형 배열을 반환한다.
    }

    public static void StringArray(String[] arr_name, int arr_length) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%d개의 문자열을 입력해주세요.\n", arr_length);
        // 1. 입력받은 숫자만큼 배열을 입력받는다.
        for (int i = 0; i < arr_length; i++) { // 배열에 값 입력 받기
            System.out.printf("문자열 (%d) : ", i+1);
            // 1-1. 문자열의 값을 입력 받는다.
            arr_name[i] = scanner.nextLine();
        }
    }


}
