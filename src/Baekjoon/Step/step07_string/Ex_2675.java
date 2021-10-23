package Baekjoon.Step.step07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2675 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int j=0; j<s.length(); j++){
               for (int k=0; k<a; k++){
                   System.out.print(s.charAt(j));
               }
            }
            System.out.println();

        }
    }
}
