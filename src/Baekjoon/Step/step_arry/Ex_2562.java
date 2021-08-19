package Baekjoon.Step.step_arry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2562 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int index=0;
        int[] arry=new int[9];
        for (int i=0; i<arry.length; i++){
            arry[i]= Integer.parseInt(br.readLine());
            if (max<arry[i]){
                max=arry[i];
                index=i+1;
            }

        }
        System.out.println(max);
        System.out.println(index);

    }
}
