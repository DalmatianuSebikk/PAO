package com.company;

import java.util.Scanner;

public class ExercitiiLab1 {
    public void Exercitiul1() {

//      Exercitiul 1.
        System.out.println("-----EXERCITIUL 1-----");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

    }

    public void Exercitiul2()
    {

        System.out.println("-----EXERCITIUL 2-----");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a > b ? a : b);
    }

    public void Exercitiul3(int n)
    {
        System.out.println("-----EXERCITIUL 3-----");
        int prod = 1;
        for(int i = 1; i <= n; i++)
        {
            prod *= i;
        }

        System.out.println(prod);
    }

    public void Exercitiul4(int n)
    {
        System.out.println("-----EXERCITIUL 4-----");
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i == 3 || i == 5)
            {
                sum += 5;
            }
        }

        System.out.println(sum);
    }

    public void Exercitiul5(int n)
    {
        System.out.println("-----EXERCITIUL 5-----");
        Scanner in = new Scanner(System.in);
        int[] pare = new int[100];
        int[] impare = new int[100];
        int counterPare = 0, counterImpare = 0;
        if (n < 0)
        {
            System.out.println("Pa");
            return;
        }

        else
        {
            for(int i = 0; i < n; i++)
            {
                if (i % 2 == 0)
                {
                    pare[counterPare] = i;
                    counterPare++;
                }
                else
                {
                    impare[counterImpare] = i;
                    counterImpare++;
                }
            }

            for(int i = 0; i < counterPare; i++)
            {
                System.out.print(i + " ");
            }
            System.out.println("Impare: ");

            for(int i = 0; i < counterImpare; i++)
            {
                System.out.print(i + " ");
            }
        }
    }


    public void Exercitiul6()
    {
        System.out.println("------EXERCITIUL 6------");
        int numarDeNumere = 0, suma = 0, medie;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int x = in.nextInt();

            if(x == -1)
            {
                break;
            }

            numarDeNumere++;
            suma += x;

        }

        System.out.println("Media este: " + (suma / numarDeNumere));

    }

    public void Exercitiul7(int n)
    {
        int a = 0, b = 1, c = 0;

        for(int i = 0; i < n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);
    }
}
