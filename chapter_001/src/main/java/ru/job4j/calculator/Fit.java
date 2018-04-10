package ru.job4j.calculator;

/**
 * Ideal weight calculator
 */

public class Fit {





private static final double MAN_CALC_FORMULA = 100;
private static final double WOMAN_CALC_FORMULA = 110;
private static final double COMPLETE_CALC_FORMULA = 1.15;






    /**
     * Ideal weight for a man.
     * @param height Height.
     * @return ideal weight.
     */
    double manWeight(double height) {
        double idealWeight4Man = (height - MAN_CALC_FORMULA) * COMPLETE_CALC_FORMULA;
        return idealWeight4Man;

    }
    /**
     * Ideal weight for a woman
     * @param height Height
     * @return ideal weight
     */
    double womanWeight(double height) {

        double idealWeight4Woman = (height - WOMAN_CALC_FORMULA) * COMPLETE_CALC_FORMULA;
        return idealWeight4Woman;
    }

}