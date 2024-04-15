import java.util.Scanner;

public class JavaBasicReview2_2 {
    public static void main(String[] args) {
        // 3개의 정수형 타입을 선언해서 입력을 받는다. Scanner로
        // 큰수와 작은수를 넣을 정수형 변수를 선언한다.
        // 최대값 최솟값을 비교하는 if문을 만들어서 먼저 숫자 1을 최대값 변수에 넣고
        // 다음 숫자를 비교하여 그보다 높으면 그 숫자 2를 최대값 변수에 넣는다.
        // 마지막으로 숫자 3도 비교해서 똑같이 한다.
        // 작은 숫자는 최대값 비교하는 것과 반대로 하면 되겠지.
        Scanner scanner = new Scanner(System.in);
        int[] numArr = new int[3];
        GetArray.intArray(numArr, 3);
        getMaxAndMin(numArr);
    }

    static void getMaxAndMin(int arr[]) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) { // 1 2 3
            if (arr[i - 1] < arr[i]) max = arr[i]; // 0 1
        }

        for (int i = 1; i < arr.length; i++) { // 1 2 3
            if (arr[i - 1] > arr[i]) min = arr[i]; // 0 1
        }

        System.out.printf("최댓값 : %d, 최솟값 : %d \n", max, min);
    }
}
