import java.util.Scanner;

public class JavaBasicReview1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("이릅 입력 : ");
            String name = scanner.nextLine();
            if (!nameValid(name)) {
                System.out.println("이름 error");
            }

            System.out.print("나이 입력 : ");
            String age = scanner.nextLine();
            if (!ageValid(age)) {
                System.out.println("나이 error");
            }

            if (nameValid(name) && ageValid(age)) {
                System.out.println(getInfo(name, age));
            } else System.out.println("error");
        }
    }

    public static String getInfo(String name, String age) {
        return "\n======= 정보 =======\n" + "이름 : " + name + "\n" + "나이 : " + age + "세 \n" + "====================";
    }

    public static boolean nameValid(String name) {
        char digit[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] check = name.toCharArray(); // name을 받을 char 배열
        if (name.length() >= 4 || name.isEmpty()) {// 길이 제한
            return false;
        }

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < digit.length; j++) {
                if (check[i] == digit[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean ageValid(String age) {
        String digit = "1234567890";
        for (char check : age.toCharArray()) {
            if (digit.indexOf(check) == -1) {
                return false;
            }
        }

        if (age.isEmpty()) { // 길이 제한
            return false;
        }

        return true;
    }
}