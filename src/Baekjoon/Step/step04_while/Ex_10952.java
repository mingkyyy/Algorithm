package Baekjoon.Step.step04_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10952 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean result=true;
        StringTokenizer st ;
        while (result){
            st = new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if (a==0 && b==0){
                result=false;
            }else{
                sb.append((a+b)+"\n");
            }
        }
        System.out.println(sb);
    }
}
