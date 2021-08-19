package Baekjoon.Step.step_arry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2577 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int count=0;

        String result = String.valueOf(a*b*c);

        for (int i=0; i<10; i++){
            for (int j=0; j<result.length(); j++){
                if ((result.charAt(j)-'0')==i){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
