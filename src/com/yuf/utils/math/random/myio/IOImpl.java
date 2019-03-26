package com.yuf.utils.math.random.myio;

import com.yuf.utils.math.random.myconverter.MyConverterImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class IOImpl implements iIO {
    @Override
    public Scanner Input() {
        return null;
    }

    @Override
    public Scanner Input(String str) {
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        return input;
    }

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
