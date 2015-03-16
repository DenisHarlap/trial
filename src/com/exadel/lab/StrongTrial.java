package com.exadel.lab;

/**
 * Created by Denis on 12.02.15.
 */
public class StrongTrial extends Trial {

    private final static double DIFFICULT_COEF = 0.8;

    public StrongTrial(String candidateName, int firstMark, int secondMark) {
        super(candidateName, firstMark, secondMark);
    }

    public StrongTrial() {
    }

    public static double getDifficultCoef() {
        return DIFFICULT_COEF;
    }

    @Override
    public int result() {
        return (int)(DIFFICULT_COEF * super.result());
    }
}
