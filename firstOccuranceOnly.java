package com.company.javaProblems.practices;
import java.util.Scanner;
public class firstOccuranceOnly {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int[] arr = new int[26];
        String result= "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                result += ' ';
            }
            else if(arr[str.charAt(i)-97]==0){
                // str.charAt(i)-97 will bring ascii value between 0 to 25 since all characters are lowercase, we
                // we subtracted 97 from it. if we don't do this, it will generate arrayIndexOutOfBoundError
                arr[str.charAt(i)-97]++;
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
