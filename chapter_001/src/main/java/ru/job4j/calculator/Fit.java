package ru.job4j.calculator;

/**
 * Ideal weight calculator
 */

public class Fit {



    /**
     * Ideal weight for a man.
     * @param height Height.
     * @return ideal weight.
     */
    double manWeight(double height) {
        final double IDEALMANWEIGHT = (height - 100)*1.15;
        return IDEALMANWEIGHT;

    }
    /**
     * Ideal weight for a woman
     * @param height Height
     * @return ideal weight
     */
    double womanWeight(double height){
        final double IDEALWOMANWEIGHT = (height - 110) * 1.15;
        return IDEALWOMANWEIGHT;
    }

}