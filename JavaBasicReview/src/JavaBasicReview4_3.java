// 주어진 정수 배열에서 최댓값, 최솟값을 찾아 출력하는 프로그램
public class JavaBasicReview4_3 {
    public static void main(String[] args) {
        // 주어진 정수 배열이 없어서 만들어준다.
        int arr[] = new int[4];
        // 미리 만들어둔 GetArray 클래서를 참조하여 인트형 배열을 입력받아 만든다.
        GetArray.intArray(arr, arr.length);
        // 전에 구현해둔 클래스의 매서드를 참조하여 최댓값, 최솟값을 구한다.
        JavaBasicReview2_2.getMaxAndMin(arr);
    }
}
