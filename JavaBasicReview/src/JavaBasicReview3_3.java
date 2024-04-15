import java.util.Scanner;
// 숫자를 입력받아 1~숫자만큼의 합을 계산하는 프로그램
public class JavaBasicReview3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 합산할 값을 받을 변수를 미리 선언 및 할당
        int sum = 0;

        while (true) {
            // 2. 숫자를 입력받습니다.
            System.out.print("숫자 입력 : ");
            int num = scanner.nextInt();
            // 3. 넘버가 음수일 경우 반복문을 탈출함으로써 제약을 걸었습니다.
            if (num < 0) {
                break;
            }
            // 4. 1부터 숫자까지 덧셈하도록 조건문을 작성하였다.
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            // 5. 마무리로 sum을 출력한다.
            System.out.printf("합산값 : %d \n", sum);
            // 6. 반복문이기 때문에 합산값을 넣는 변수인 sum을 초기화한다.
            sum = 0;
        }
    }
}
