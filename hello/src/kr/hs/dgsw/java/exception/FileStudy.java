package kr.hs.dgsw.java.exception;

import java.io.*;
import java.security.cert.CertSelector;

public class FileStudy {
    public String readFile(String filePath) {

        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader((file));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String result = "";

            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        FileStudy study = new FileStudy();
        String str = study.readFile("/Users/yunseokgyu/study/school-class/java-vocational-class/hello/src/kr/hs/dgswf/java/exception/hello.txt");
        System.out.println(str);
    }
}
