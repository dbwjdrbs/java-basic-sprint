import java.util.Scanner;

public class JavaBasicReview2_1 {
    public static void main(String[] args) {
        // 1. Scanner scanner 인스턴스 받기
        // 2. 입력받을 두 정수형 변수와 Scanner
        // 3. 나눗셈이 0일 경우 거르기 (매소드 만들어서 하기)
        // 4. if문으로 사칙연산 결과 띄우기
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("입력 (1) : ");
            double num1 = scanner.nextInt();
            System.out.print("입력 (2) : ");
            double num2 = scanner.nextInt();

            getResult(num1, num2);
        }
    }
    static void getResult(double num1, double num2) {
        System.out.printf("덧셈 : %d\n", num1 + num2);
        System.out.printf("뺄셈 : %d\n", num1 - num2);
        System.out.printf("곱셈 : %d\n", num1 * num2);
        if(num1 == 0 && num2 == 0) {
            System.out.print("나눗셈 : 0\n");
        } else System.out.printf("나눗셈 : %d\n", num1 / num2);
    }

}
