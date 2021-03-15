package com.company.javaProblems.practices;
import java.util.Scanner;
public class printAllPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        findAllPrime(n1, n2);
    }

    public static void findAllPrime(int n1, int n2){
        for(int num=n1; num<=n2; num++){
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
