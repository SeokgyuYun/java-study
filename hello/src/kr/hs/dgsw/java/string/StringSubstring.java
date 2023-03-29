package kr.hs.dgsw.java.string;

public class StringSubstring {
    void study() {
        String str = "나 보기가 역겨워 가실 때에는, 말없이 고이 보내 드리오리다.";

        showSubstring(str, 0, 5);
        showSubstring(str, 10, 12);
//        showSubstring(str, 12, 5);
//        showSubstring(str, 300, 302);

        replaceString(str, "역겨워", "좋아");
    }

    void showSubstring(String str, int from, int to) {
        String sub = str.substring(from, to);
        System.out.printf("\"%s\"의 %d부터 %d까지의 문자열은 \"%s\" 입니다. \n", str, from, to, sub);
    }

    void replaceString(String str, String from, String to) {
        String replaceStr = str.replace(from, to);
        System.out.printf("\"%s\"의 \"%s\"을 \"%s\"로 바꾼 문자열은 \"%s\" 입니다. \n", str, from, to, replaceStr);
    }

    public static void main(String[] args) {
        StringSubstring stringSubstring = new StringSubstring();
        stringSubstring.study();
    }
}
