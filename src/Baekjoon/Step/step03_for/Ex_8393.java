package Baekjoon.Step.step03_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_8393 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
