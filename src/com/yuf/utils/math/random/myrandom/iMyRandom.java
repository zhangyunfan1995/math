package com.yuf.utils.math.random.myrandom;

import java.util.ArrayList;
import java.util.Random;
/*
随机数生成模块接口 用于生成各种要求的随机数
 */
public interface iMyRandom {
    Random CreateARandom();
    Random CreateSeedRandom(long seed);
    ArrayList<Integer> CreateSeedRandomList(long seed, int digit, int count);
    
}
