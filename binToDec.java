package com.company.javaProblems.practices;
import java.util.Scanner;
public class binToDec {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int bin = scn.nextInt();
        int result = 0;
        int power = 1;
        while(bin != 0){
            int temp = bin%10;
            bin /= 10;
            result += temp*power;
            power *= 2;
        }
        System.out.println(result);
    }
}
