package kr.hs.dgsw.java.condition;

public class Grade {
    String divideGrade(int score) {
        if (score >= 90) {
            return "수";
        } else if (score >= 80) {
            return "우";
        } else if (score >= 70) {
            return "미";
        } else if (score >= 60) {
            return "양";
        } else {
            return "가";
        }
    }
}
