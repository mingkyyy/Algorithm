package Baekjoon.Step.step03_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2739 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
