package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return f -> {
            List<Integer> list = new ArrayList<>();
            for (Integer x : f){
                x = (int)x / divider;
                list.add(x);
            }
            return list;
        };
    }
}
