package ru.job4j.max;
    /**
     * @author Sergey Arsenyev (sarsenyev@hotmail.com)
     * @version $Id$
     * @since 0.1
     */

    public class Max {

        /**
         * Возвращаем большее значение из двух чисел
         *
         * @param first  number.
         * @param second number.
         * @return Max.
         */


        public int max(int first, int second) {
            return first < second ? second : first;

        }

        /**
         * Возвращаем большее значение из трёх чисел
         *
         * @param first  number.
         * @param second number.
         * @param third  number.
         * @return Max.
         */
        public int max(int first, int second, int third) {
            return max(this.max(first, second), third);


            }
        }




