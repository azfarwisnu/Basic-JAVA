package com.fibonaccilatihan;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
       int fn,fn1,fn2,i,n;
        Scanner inputdata;

        fn2 = 0;
        fn1 = 1;
        fn = 1;
        i = 1;
        inputdata = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        n = inputdata.nextInt();

        while (i <= n) {
            System.out.println("awal " + i + "  = " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            i++;

        }

        System.out.println("==================================");

        fn2 = 0;
        fn1 = 1;
        fn = 1;
        i = 1;
        inputdata = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        n = inputdata.nextInt();

        do {

            System.out.println("awal " + i + "  = " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            i++;

        } while (i <= n);


        System.out.println("==================================");

        fn2 = 0;
        fn1 = 1;
        fn = 1;
        i = 1;
        inputdata = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        n = inputdata.nextInt();

        for (; i <= n; i++){
            System.out.println("awal " + i + "  = " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }


    }



}
