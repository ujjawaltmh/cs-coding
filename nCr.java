package com.company.javaProblems.practices;
import java.util.Scanner;
public class nCr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        System.out.println(ncr(n,r));
    }

    public static int ncr(int n, int r){
        int fact1 = factorial(n);
        int fact2 = factorial(r);
        int fact3 = factorial(n-r);
        return fact1/(fact2*fact3);
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
