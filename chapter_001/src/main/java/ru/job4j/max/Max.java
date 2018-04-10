package ru.job4j.max;
    /**
     * @author Sergey Arsenyev (sarsenyev@hotmail.com)
     * @version $Id$
     * @since 0.1
     */

    public class Max {
        /**
         * Возвращаем большее значение из двух чисел
         * @param first number.
         * @param second number.
         * @return second.
         */


    public int max(int first, int second) {
        return first < second ? second : first;

    }
}
