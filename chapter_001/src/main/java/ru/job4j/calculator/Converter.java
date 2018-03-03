package ru.job4j.calculator;


    /**
     * Конвертор валюты.
     */
    public class Converter {

      public int  currentRubelCurrencyForEuro = 70;
      public int currentRubelCurrencyForDollar = 60;




        /**
         * Конвертируем рубли в евро.
         * @param value рубли.
         * @return Евро.
         */
        public int rubleToEuro(int value) {
          final int euro = value/currentRubelCurrencyForEuro;
            return euro;

        }

        /**
         * Конвертируем рубли в доллары.
         * @param value рубли.
         * @return Доллары
         */
        public int rubleToDollar(int value) {
           final int dollar = value/currentRubelCurrencyForDollar;
            return dollar;

        }
        /**
         * Конвертируем евро в рубли.
         * @param value евро.
         * @return рубли
         */
        public int euroToRubel(int value) {
           final int rubel = value*currentRubelCurrencyForEuro;
            return rubel;

    }
        /**
         * Конвертируем дсллары в рубли.
         * @param value доллары.
         * @return рубли
         */
        public int DollarToRubel(int value) {
           final int rubel = value*currentRubelCurrencyForDollar;
            return rubel;
        }

}
