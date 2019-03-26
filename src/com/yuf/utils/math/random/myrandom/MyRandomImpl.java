package com.yuf.utils.math.random.myrandom;



import java.util.ArrayList;
import java.util.Random;
/*
随机数生成模块 用于生成各种要求的随机数
 */
public class MyRandomImpl implements iMyRandom {
    //简单生成一个随机数(预留)
    @Override
    public Random CreateARandom() {
        Random random = new Random();
        return random;
    }

    //用seed简单生成一个随机数
    @Override
    public Random CreateSeedRandom(long seed) {
        Random random = new Random();
        random.setSeed(seed);
        return random;
    }

    //生成一个固定种子,取值范围,数值个数的随机数组
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
