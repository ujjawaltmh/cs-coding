package com.company.javaProblems.practices;
import java.util.Scanner;
public class characterPattern2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char ch = (char) (64+i);
            while(j<=n){
                System.out.print(ch++ +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
