package Baekjoon.Step.step_arry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_8958 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        int sum=0;
        String[] arry = new String[n];


        for (int i=0; i<arry.length;i++){
            arry[i]=br.readLine();
            for (int j=0; j<arry[i].length(); j++){
                if (arry[i].charAt(j)=='O'){
                        count++;
                  // System.out.println(count);
                }else if (arry[i].charAt(j)=='X'){
                    count=0;
                }
                sum+=count;
            }
            System.out.println(sum);
            sum=0;
            count=0;
        }
    }

}
