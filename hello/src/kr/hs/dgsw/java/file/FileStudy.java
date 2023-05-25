package kr.hs.dgsw.java.file;

import java.io.File;

public class FileStudy {
    public void studyFile() {
        File file = null;
        File file1 = null;

        file = new File("/Users/yunseokgyu/study/school-class/java-vocational-class/hello/src/kr/hs/dgsw/java/exception/hello.txt");
        file1 = new File("/Users/yunseokgyu/study/school-class/java-vocational-class/hello/src/kr/hs/dgsw/java/exception/hello123.txt");

        System.out.printf("%s 존재 여부 %b\n", file.getName(), file.exists());
        System.out.printf("%s 존재 여부 %b\n", file1.getName(), file1.exists());

        File dir = new File("/Users/yunseokgyu/");
        System.out.printf("%s 존재 여부 %b\n", dir.getName(), dir.exists());

        System.out.printf("%s 존재 여부 %b\n", dir.getName(), dir.exists());
        System.out.printf("%s 의 디렉토리 여부 %b\n", dir.getName(), dir.isDirectory());
        System.out.printf("%s 의 파일 여부 %b\n", dir.getName(), dir.isFile());

        System.out.printf("%s 의 디렉토리 여부 %b\n", file1.getName(), dir.isDirectory());
        System.out.printf("%s 의 파일 여부 %b\n", file1.getName(), dir.isFile());

        File subDir = new File(dir, "child1");
        subDir.mkdirs();
        subDir.delete();
    }

    public static void main(String[] args) {
        FileStudy study = new FileStudy();
        study.studyFile();
    }
}
