package com.company.javaProblems.practices;
import java.util.Scanner;

public class isFibOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        verify(n);
    }

    public static void verify(int n){
        int a = 0;
        int b = 1;
        int count = 1;
        while(a <= n){
            if(a == n){
                System.out.println("true,"+" found at position "+count);
                return;
            }else{
                int c = a + b;
                a = b; b = c;
                count++;
            }
        }
        System.out.println("Not a part of fibonacci series...");
    }
}
