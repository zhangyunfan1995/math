package com.yuf.utils.math.random.myconverter;

import java.util.Random;
/*
转换器,用于各类型之间的转换(预留)
 */
public interface iMyConverter {
    String DoubleToString(Double d);
    Double StringToDouble(String t);
    Long StringToLong(String t);
    Integer DoubleToInteger(Double d);
    String IntegerToString(Integer i);
    Double RandomToDouble(Random r);
    Integer RandomToInteger(Random r);
}
