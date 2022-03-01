package com.company;

import java.util.Scanner;

public class Main {

    public static void Factorial()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Exercitiul 3");
        int n, i, fact = 1;

        n = input.nextInt();

        for(i = 1; i <= n; i++)
            fact *= i;

        if(n == 0)
            fact = 1;

        System.out.println("Factorialul este: " + fact);
    }

    public static void Multipli()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Exercitiul 4");
        int n, multipli = 15, suma = 0;

        n = input.nextInt();

        while(multipli <= n)
        {
            suma += multipli;
            multipli += 15;
        }

        System.out.println("Suma este: " + suma);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Ex 1
        System.out.println("Exercitiul 1");
        int n, i;

        n = input.nextInt();

        for(i = 1; i <= n; i++)
            if(i % 2 == 0)
                System.out.println(" " + i);

        //Ex 2
        System.out.println("Exercitiul 2");
        int a, b, maxi;

        a = input.nextInt();
        b = input.nextInt();

        maxi = Math.max(a, b);
        System.out.println("Numarul mai mare este: " + maxi);

        //Ex 3
        Factorial();

        //Ex 4
        Multipli();

        //Ex 5
        System.out.println("Exercitiul 5");
        int x, ctpare = 0, ctimpare = 0;
        int pare[] = new int[101];
        int impare[] = new int[101];

        n = input.nextInt();

        for(i = 1; i <= n; i++)
        {
            x = input.nextInt();
            if(x % 2 == 0)
                pare[++ctpare] = x;
            else
                impare[++ctimpare] = x;
        }

        for(i = 1; i <= ctpare; i++)
            System.out.println(pare[i]);
        for(i = 1; i <= ctimpare; i++)
            System.out.println(impare[i]);

        //Ex 6
        System.out.println("Exercitiul 6");
        int ct = 0;
        float media, suma = 0;

        n = input.nextInt();

        while(n != -1)
        {
            suma += n;
            ct++;
            n = input.nextInt();
        }

        media = suma/ct;
        System.out.println("Media este " + media);
    }
}