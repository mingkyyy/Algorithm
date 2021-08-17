package Baekjoon.Step.step03_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex_15552 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());
        int a=0;
        int b=0;

        StringTokenizer st;


        for (int i=0; i<t; i++){
            st=new StringTokenizer(br.readLine()," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");

        }

        bw.flush();
        bw.close();
        br.close();


    }
}
