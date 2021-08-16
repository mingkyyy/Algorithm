package Baekjoon.Step.step02_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2753 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());

        if (n%4==0 && n%100!=0 || n%400==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
