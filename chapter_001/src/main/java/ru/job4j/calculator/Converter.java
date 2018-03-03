package ru.job4j.calculator;


    /**
     * Конвертор валюты.
     */
    public class Converter {

       int  rubelCurrencyToEuro = 70;
       int rubelCurrencyToDollar = 60;




        /**
         * Конвертируем рубли в евро.
         * @param value рубли.
         * @return Евро.
         */
        public int rubleToEuro(int value) {
            return value/rubelCurrencyToEuro;

        }

        /**
         * Конвертируем рубли в доллары.
         * @param value рубли.
         * @return Доллары
         */
        public int rubleToDollar(int value) {
            return value/rubelCurrencyToDollar;

        }
        /**
         * Конвертируем евро в рубли.
         * @param value евро.
         * @return рубли
         */
        public int euroToRubel(int value) {
            return value*rubelCurrencyToEuro;

    }
        /**
         * Конвертируем дсллары в рубли.
         * @param value доллары.
         * @return рубли
         */
        public int DollarToRubel(int value)
        {
            return value*rubelCurrencyToDollar;
        }

}
