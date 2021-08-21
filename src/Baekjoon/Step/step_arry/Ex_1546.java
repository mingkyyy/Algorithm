package Baekjoon.Step.step_arry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1546 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] test= new int[n];
        int max=0;
        int sum=0;
        double avg=0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<test.length; i++){
            test[i]=Integer.parseInt(st.nextToken());
            if (test[i]>max){
                max=test[i];
            }
            sum+=test[i];
        }
        avg=100.0*sum/max/n;
        System.out.println(avg);

    }
}
