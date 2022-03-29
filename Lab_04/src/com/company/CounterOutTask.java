package com.company;

public class CounterOutTask implements Task{
    private static int count;

    public CounterOutTask(){
        count += 1;
    }

    @Override
    public void execute() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        CounterOutTask cot = new CounterOutTask();
        cot.execute();

        cot = new CounterOutTask();
        cot.execute();

        cot = new CounterOutTask();
        cot.execute();
    }
}
