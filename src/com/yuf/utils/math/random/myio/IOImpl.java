package com.yuf.utils.math.random.myio;


import java.util.ArrayList;
import java.util.Scanner;
/*
输入输出模块接口实现
 */
public class IOImpl implements iIO {
    //预留
    @Override
    public Scanner Input() {
        return null;
    }

    //预留
    @Override
    public Scanner Input(String str) {
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        return input;
    }

    //将随机数生成模块生成的随机数arrayList转化为屏幕输出
    @Override
    public void Output(ArrayList<?> e) {
        for(int i = 0;i<e.size();i++){
            if(i%5 ==0){
                System.out.println();
            }
            System.out.print(e.get(i)+"  ");
        }
    }


}
