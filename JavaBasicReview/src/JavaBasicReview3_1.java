import java.util.Scanner;

public class JavaBasicReview3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 숫자를 입력 받습니다.
        System.out.print("숫자 입력 : ");
        int num = scanner.nextInt();
        // 2. 결과값을 매서드를 통해 호출합니다.
        getResult(num);
    }

    static void getResult(int num) {
        // 1. 0일 경우 0이라고 출력
        if (num == 0) {
            System.out.println("입력받은 숫자는 0");
            // 2. 양수인 경우
        } else if (num > 0) {
            System.out.println("입력받은 숫자는 양수");
            // 3. 음수인 경우
        } else if (num < 0) {
            System.out.println("입력받은 숫자는 음수");
        }
    }
}
