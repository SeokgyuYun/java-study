package kr.hs.dgsw.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {
    FileInputStream is;
    public String readString(String filePath) {
        try {
            File file = new File(filePath);
            is = new FileInputStream(file);

            String result = "";
            String str = null;
            int length = 0;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer)) > 0) {
                str = new String(buffer, 0, length);
                result += str;
            }
            System.out.println("check1");

            return result;
        } catch (Exception e) {
            System.out.println("check2");
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            System.out.println("check3");

            if (is != null) {
                try {
                    is.close();
                } catch (IOException e1) {}
            }
        }
    }

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader();
        String str = reader.readString("/Users/yunseokgyu/study/school-class/java-vocational-class/hello/src/kr/hs/dgsw/java/exception/hello.txt");
        System.out.println(str);
    }
}
