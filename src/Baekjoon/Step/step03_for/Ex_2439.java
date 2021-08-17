package Baekjoon.Step.step03_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2439 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++){
            for (int j=n-1; j>=i; j--){
                System.out.print(" ");
                }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
