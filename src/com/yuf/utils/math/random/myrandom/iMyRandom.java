package com.yuf.utils.math.random.myrandom;

import java.util.ArrayList;
import java.util.Random;

public interface iMyRandom {
    Random CreateARandom();
    Random CreateSeedRandom(long seed);
    ArrayList<Integer> CreateSeedRandomList(long seed, int digit, int count);
    
}
