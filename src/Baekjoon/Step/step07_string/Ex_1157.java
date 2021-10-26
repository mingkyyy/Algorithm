package Baekjoon.Step.step07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Ex_1157 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase(Locale.ROOT);
        int array[] = new int[26];
        int max = 0;
        char result ='?';

        for (int i=0; i<s.length(); i++){
            array[s.charAt(i)-65]++;
            if (max<array[s.charAt(i)-65]){
                max = array[s.charAt(i)-65];
                result = s.charAt(i);
            }else if (max == array[s.charAt(i)-65]){
                result='?';
            }
        }
        System.out.println(result);
    }
}
