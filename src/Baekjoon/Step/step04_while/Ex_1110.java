package Baekjoon.Step.step04_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        boolean result=true;
        int n2=n;

        while (result) {
            int m = (n/10)+(n%10);
            int z=0;
            if (m<10){
                z=(n%10)*10+m;
            }else{
                 z=(n%10)*10+(m%10);
            }
            if (n2==z) {
                result = false;
            }
            count++;
            n=z;
        }
        System.out.println(count);
    }
}

