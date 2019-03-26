package com.yuf.utils.math.random.randomtest;

import com.yuf.utils.math.random.myconverter.MyConverterImpl;
import com.yuf.utils.math.random.myio.IOImpl;
import com.yuf.utils.math.random.myrandom.MyRandomImpl;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*主程序,没用junit,有需要自己加
*本小工具用于生成一组均匀分布的随机数数列
*
*/
public class RandomTest {
    public static void main(String [] args){
        //所有输入的字符必须为数字,否则报错
        //输入种子
        Scanner seedScan = new IOImpl().Input("Please input the seed");
        long seed = seedScan.nextLong();
        //输入每一个数字的范围 [0,digit)
        Scanner digitScan = new IOImpl().Input("Please input the digit");
        int digit = digitScan.nextInt();
        //输入需要输出的数字的个数(最小值为1)
        Scanner countScan = new IOImpl().Input("Please input the count");
        int count = countScan.nextInt() -1;
        //由生成模块生成
        ArrayList<Integer> randomList = new MyRandomImpl().CreateSeedRandomList(seed, digit, count);
        //由输出模块输出
        new IOImpl().Output(randomList);

    }
}
