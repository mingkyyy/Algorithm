package Baekjoon.Step.step08_math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2292 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 1;
        int tmp = 1;

        while (true){
            if (range>= n){
                break;
            }else {
                tmp = 6*(cnt++);
                range +=tmp;
            }
        }
        System.out.println(cnt);

    }
}
