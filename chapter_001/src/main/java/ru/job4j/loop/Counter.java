package ru.job4j.loop;

public class Counter {
    /**
     * Method add.
     *
     * @param start  starting counting number
     * @param finish ending counting number.
     * @return sum of odd numbers
     */

    public int add(int start, int finish) {
        int total = 0;

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                total += i;
            }

        }
        return total;
    }
}