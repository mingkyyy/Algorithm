package Baekjoon.Step.step08_math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2869 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 낮에 올라감
        int b = Integer.parseInt(st.nextToken()); // 떨어짐짐
        int v = Integer.parseInt(st.nextToken()); //높이

       int day = (v - b) / (a - b);
       if ((v-b)%(a-b) != 0){
           day++;
       }
        System.out.println(day);

    }
}
