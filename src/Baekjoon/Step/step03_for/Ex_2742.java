package Baekjoon.Step.step03_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2742 {
    public static void main(String[] args)throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        for (int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}
