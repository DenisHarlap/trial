package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class LightTrial extends Trial {

    private final static int GOOD_MARK_FIRST = 50;
    private final static int GOOD_MARK_SECOND = 65;

    public LightTrial(String candidateName, int firstMark, int secondMark) {
        super(candidateName, firstMark, secondMark);
    }

    public LightTrial() {
    }

    public static int getGoodMarkFirst() {
        return GOOD_MARK_FIRST;
    }

    public static int getGoodMarkSecond() {
        return GOOD_MARK_SECOND;
    }

    @Override
    public boolean isPassed() {
        return this.getFirstMark() >= GOOD_MARK_FIRST &&
                this.getSecondMark() >= GOOD_MARK_SECOND;
    }
}
