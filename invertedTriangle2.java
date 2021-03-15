package com.company.javaProblems.practices;
import java.util.Scanner;

public class invertedTriangle2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i<=n){
            int s=1;
            while(s<i){
                System.out.print(" "+" ");
                s++;
            }
            int j=1;
            while(j<=n-i+1){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
