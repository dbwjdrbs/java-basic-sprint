import java.util.Scanner;

public class JavaBasicReview4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 클래스를 참조하여 scanner 라는 객체 생성
        // 5만큼의 값을 받을 수 있는 정수형 배열 선언
        int[] score = new int[5];
        // 평균값을 반환 받는 변수 선언
        int average;

        // 1. GetArray 라는 클래스를 만들어 그 안에 매서드를 생성하여 int값을 입력받도록 한다.
        GetArray.intArray(score, score.length);
        // 2. 아래 만들어둔 getAverage 라는 매서드에 score 값을 넣어서 평균을 구한다.
        average = getAverage(score);
        // 3. 출력
        System.out.println("배열의 평균은 " + average);
    }

    public static int getAverage(int[] arr) {
        // 결과 값을 넣을 result 변수를 선언하고 0으로 초기화하였다.
        int result = 0;

        // enhanced for문을 이용하여 result 변수에 배열값을 모두 더한 값을 할당한다.
        for (int i : arr)
            result += i;

        // 배열을 모두 더한 값을 배열의 길이만큼 나누어 평균을 반환한다.
        return result / arr.length;
    }
}
