package com.yuf.utils.math.random.myio;

import java.util.ArrayList;
import java.util.Scanner;
/*

输入输出模块接口
 */
public interface iIO {
    Scanner Input();
    Scanner Input(String atr);
    void Output(ArrayList<?> e);

}
