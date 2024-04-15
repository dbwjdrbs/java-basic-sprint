// 1~100까지 짝수만 출력하는 프로그램
public class JavaBasicReview3_2 {
    public static void main(String[] args) {
        // 1. 1~100까지 반복문을 이용하여 구현합니다.
        for (int i = 1; i <= 100; i++) {
            // 2. 조건문으로 2를 나눈 값이 0일 경우
            if (i % 2 == 0) {
                // 3. 출력하도록 한다.
                System.out.print(i + " ");
            }
        }
    }
}
