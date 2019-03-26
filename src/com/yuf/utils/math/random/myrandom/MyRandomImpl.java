package com.yuf.utils.math.random.myrandom;



import java.util.ArrayList;
import java.util.Random;

public class MyRandomImpl implements iMyRandom {
    @Override
    public Random CreateARandom() {
        Random random = new Random();
        return random;
    }

    @Override
    public Random CreateSeedRandom(long seed) {
        Random random = new Random();
        random.setSeed(seed);
        return random;
    }

    @Override
    public ArrayList<Integer> CreateSeedRandomList(long seed,int digit, int count) {
        Random random = new Random();
        random.setSeed(seed);
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i=0;i<=count;i++) {
            randomList.add(random.nextInt(digit));
        }
        return randomList;
    }
}
