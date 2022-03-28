package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PasswordMaker {
    private final int MAGIC_NUMBER = randomInt();
    private final String MAGIC_STRING = randomString();
    private String name;

    public PasswordMaker(){}
    public PasswordMaker(String name){
        this.name = name;
    }

    public int randomInt(){
        String numbers = "123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;

        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(numbers.length());
            char randomChar = numbers.charAt(index);

            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return parseInt(randomString);
    }

    public String randomString(){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 10;

        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
    }

    public String getPassword(){
        Random random = new Random();
        int index = random.nextInt(100);
        String password = MAGIC_STRING + MAGIC_NUMBER + name.length() + index;
        return password;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");
        PasswordMaker pm = new PasswordMaker(input.next());

        System.out.println(pm.name + ", your generated password is: " + pm.getPassword());
    }
}
