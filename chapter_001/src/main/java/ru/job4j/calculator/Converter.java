package ru.job4j.calculator;


/**
 * Конвертор валюты.
 */
public class Converter {

    private static final int EUROCURRENT = 70;
    private static final int DOLLARCURRENT = 60;




    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        int euro = value / EUROCURRENT;
        return euro;

    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        int dollar = value / DOLLARCURRENT;
        return dollar;

    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли
     */
    public int euroToRubel(int value) {
        int rubel = value * EUROCURRENT;
        return rubel;

    }
    /**
     * Конвертируем дсллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int dollarToRubel(int value) {
        int rubel = value * DOLLARCURRENT;
        return rubel;
    }

}