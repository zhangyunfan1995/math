package com.yuf.utils.math.random.myconverter;

import com.yuf.utils.math.random.myrandom.MyRandomImpl;

import java.util.Random;
/*

转换器,用于各类型之间的转换(预留)
 */
public class MyConverterImpl implements iMyConverter {

    //Double至String
    @Override
    public String DoubleToString(Double d) {
        return null;
    }


    @Override
    public Double StringToDouble(String t) {
        return null;
    }

    @Override
    public Long StringToLong(String t) {
        long l = Long.parseLong(t);
        return l;
    }

    @Override
    public Integer DoubleToInteger(Double d) {
        return null;
    }

    @Override
    public String IntegerToString(Integer i) {
        return null;
    }

    @Override
    public Double RandomToDouble(Random r) {
        double v = r.nextDouble();
        return v;
    }

    @Override
    public Integer RandomToInteger(Random r) {
        Integer i = r.nextInt();
        return i;
    }
}
