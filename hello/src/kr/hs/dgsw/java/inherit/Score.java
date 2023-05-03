package kr.hs.dgsw.java.inherit;

import java.util.Date;

public class Score {
    protected final int point;

    public Score(int point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Score)) {
            return false;
        }
        return getGrade().equals(((Score) obj).getGrade());
    }

    public String getGrade() {
        if (point >= 90) return "수";
        else if (point >= 80) return "우";
        else if (point >= 70) return "미";
        else if (point >= 60) return "양";
        else return "가";
    }

    @Override
    public String toString() {
        return String.format("점수는 %d점이고, 등급은 '%s'입니다.", point, getGrade());
    }

    public static void main(String[] args) {
        Object object = new Object();
        Score score = new Score(82);
        Date date = new Date();

        System.out.println(object.toString());
        System.out.println(score.toString());
        System.out.println(date.toString());

        String str1 = new String("대한민국");
        String str2 = new String("Republic of Korea");
        boolean same = str1.equals(str2);

        Score score1 = new Score(93);
        Score score2 = new Score(93);
        System.out.println(score1.equals(score2));
        System.out.println(score1.equals(score1));
    }
}
