public class StringUtil {
    public static void reverse(String str) {
        //문자열 뒤집기
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += (str.charAt(i));
        }

        System.out.println(result);
    }

    public static void concat(String str1, String str2) {
        System.out.println(str1 + str2);
    }

    public static void contains(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.printf("'%c' 문자열을 포함하고 있습니다. \n", ch);
            }
        }
    }

    public static void concat(String str1, String str2, String str3) {
        System.out.println(str1 + str2 + str3);
    }

    public static void contains(String str1, String str2) {
        // IN, SPRING
           if (str2.contains(str1)) {
               System.out.println("포함됨");
           }
//            for (int j = i; j < j + str1.length(); j++) {
//                if (str1 == str)
//            }

    }
}
