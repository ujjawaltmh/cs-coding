package com.company.javaProblems.practices;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class firstOccurance {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char[] s = str.toCharArray();
        Set set= new HashSet<>();
        for(int i=0; i<s.length; i++){
            if(set.contains(s[i])){

            }else{
                System.out.print(s[i]);
                set.add(s[i]);
            }
        }
    }
}
