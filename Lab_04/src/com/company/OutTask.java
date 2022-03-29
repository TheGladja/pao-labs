package com.company;

import java.util.Scanner;

public class OutTask implements Task{
    private String message;

    public OutTask(){}
    public OutTask(String message){
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti mesajul: ");

        OutTask ot = new OutTask(input.next());

        ot.execute();
    }
}
