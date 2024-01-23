package org.example.util;

import java.util.Random;

public class RandomGen {
    public static int[] getRandomIntegerArray(int length) {
        Random random = new Random();
        int[] temp = new int[length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = random.nextInt(100);
        }

        return temp;
    }
}
