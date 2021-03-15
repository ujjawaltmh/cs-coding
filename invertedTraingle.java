package com.company.javaProblems.practices;
import java.util.Scanner;
public class invertedTraingle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = n;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i--;
        }

    }
}
