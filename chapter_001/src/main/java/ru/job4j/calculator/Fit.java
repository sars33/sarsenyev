package ru.job4j.calculator;

/**
 * Ideal weight calculator
 */

public class Fit {





private static final double MANCALCFORMULA = 100;
private static final double WOMANCALCFORMULA = 110;
private static final double COMPLETECALCFORMULA = 1.15;






    /**
     * Ideal weight for a man.
     * @param height Height.
     * @return ideal weight.
     */
    double manWeight(double height) {
        double idealWeight4Man = (height - MANCALCFORMULA)*COMPLETECALCFORMULA;
        return idealWeight4Man;

    }
    /**
     * Ideal weight for a woman
     * @param height Height
     * @return ideal weight
     */
    double womanWeight(double height){

        double idealWeight4Woman = (height - WOMANCALCFORMULA)*COMPLETECALCFORMULA;
        return idealWeight4Woman;
    }

}