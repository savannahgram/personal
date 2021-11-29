package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    public List<Character> numberRange =   Arrays.asList('A','B','C','D','E','F','G','H','I','J');
    public List<Integer> weight = Arrays.asList(10,30,25,60,20,70,10,80,20,30);
    public List<Integer>  weightsum = new ArrayList<>();
//add way to change range
// add way to decipher statistics to create weight
// front end
    
    public List<Integer> createList()

    {
        int i = 0, j = 0, k = 0;
        Random Rnd = new Random();

        weightsum.add(weight.get(0));

        for (i = 1; i < 10; i++) {
            weightsum.add(weightsum.get(i - 1) + weight.get(i));
        }
        return weightsum;
    }
}
