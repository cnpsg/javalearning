package com.zdxh.thread.t2;

import java.util.Arrays;
import java.util.List;

public class Dome7 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(10,20,30,40);
        int res = new Dome7().add(values);
        System.out.println("计算的结果："+res);

    }
    public int add(List<Integer> values){
        values.parallelStream().forEach(System.out :: println);
        return values.parallelStream().mapToInt(a ->a).sum();
        //return 0;
    }
}
