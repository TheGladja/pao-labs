package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomTask implements Task{
    private int number;

    public RandomTask(){
        Random random = new Random();
        number = random.nextInt(1000);
    }

    @Override
    public void execute() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        RandomTask rt = new RandomTask();

        rt.execute();
    }
}
