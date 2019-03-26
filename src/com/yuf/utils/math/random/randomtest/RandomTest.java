package com.yuf.utils.math.random.randomtest;

import com.yuf.utils.math.random.myconverter.MyConverterImpl;
import com.yuf.utils.math.random.myio.IOImpl;
import com.yuf.utils.math.random.myrandom.MyRandomImpl;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String [] args){
        Scanner seedScan = new IOImpl().Input("Please input the seed");
        long seed = seedScan.nextLong();
        Scanner digitScan = new IOImpl().Input("Please input the digit");
        int digit = digitScan.nextInt();
        Scanner countScan = new IOImpl().Input("Please input the count");
        int count = countScan.nextInt() -1;
        ArrayList<Integer> randomList = new MyRandomImpl().CreateSeedRandomList(seed, digit, count);
        new IOImpl().Output(randomList);

    }
}
