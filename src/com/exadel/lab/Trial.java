package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class Trial implements Comparable <Trial>{

    private String candidateName;
    private int firstMark;
    private int secondMark;
    private static final int PASS_MARK = 145;

    public Trial(String candidateName, int firstMark, int secondMark) {
        this.candidateName = candidateName;
        this.firstMark = firstMark;
        this.secondMark = secondMark;
    }
    public Trial(){
        super();
    }

    public static int getPassMark() {
        return PASS_MARK;
    }

    public String getCandidateName() {

        return candidateName;
    }

    public int getFirstMark() {
        return firstMark;
    }

    public void setFirstMark(int firstMark) {
        this.firstMark = firstMark;
    }

    public int getSecondMark() {
        return secondMark;
    }

    public void setSecondMark(int secondMark) {
        this.secondMark = secondMark;
    }

    @Override
    public String toString() {
        return  candidateName + ';' + firstMark + ";"+ secondMark + ";"
                + result() + ";" + isPassed();
    }

    public int result (){
        return firstMark + secondMark;
    }

    public boolean isPassed (){
        return result() >= PASS_MARK;
    }

    @Override
    public int compareTo(Trial obj) {
        return this.result() - obj.result();
    }

    public void clearMarks(){
        firstMark = 0;
        secondMark = 0;
        result();
        isPassed();
    }

    @Override
    public int hashCode() {
        int result = firstMark;
        result = 31 * result + secondMark;
        return result;
    }
}
