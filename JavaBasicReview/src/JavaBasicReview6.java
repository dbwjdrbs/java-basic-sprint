public class JavaBasicReview6 {
    public static void main(String[] args) {
        String str1 = "안녕하세요.";

        StringUtil.reverse(str1);
        StringUtil.concat(str1, "하이");
        StringUtil.contains(str1, '안');

        StringUtil.concat(str1, "하이", "헬로");
        StringUtil.contains("하세", str1);

    }
}
