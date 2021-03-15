package com.company.javaProblems.practices;
import java.util.Scanner;

public class printAllPrime2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        findAllPrime(n);
    }

    public static void findAllPrime(int n){
        for(int num=n; ; num++){
            verifyPrime(num);
        }
    }

    private static void verifyPrime(int num){
        if(num == 1) return;
        for(int i=2; i*i <= num; i++){
            if(num%i==0) return;
        }
        System.out.println(num);
    }
}
