package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class ExtraTrial extends Trial {

    private int additionalMark;
    private final static int GOOD_MARK = 40;

    public ExtraTrial(String candidateName, int firstMark, int secondMark, int additionalMark) {
        super(candidateName, firstMark, secondMark);
        this.additionalMark = additionalMark;
    }

    public ExtraTrial() {
    }

    public int getAdditionalMark() {
        return additionalMark;
    }

    public void setAdditionalMark(int additionalMark) {
        this.additionalMark = additionalMark;
    }

    public static int getGoodMark() {
        return GOOD_MARK;
    }

    @Override
    public String toString() {
        return  this.getCandidateName() + ";" + this.getFirstMark() + ";"
            + this.getSecondMark() + ";" + additionalMark + ";"+ result() + ";" +
                isPassed() + ";";
    }

    @Override
    public boolean isPassed() {
        return super.isPassed() && additionalMark >= GOOD_MARK;
    }

    @Override
    public void clearMarks() {
        super.clearMarks();
        additionalMark = 0;
    }
}
