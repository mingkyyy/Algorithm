package Baekjoon.Step.step03_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex_10871 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int n=Integer.parseInt(st.nextToken());
        int x= Integer.parseInt(st.nextToken());

        int[] arry=new int[n];

        st=new StringTokenizer(br.readLine()," ");
        for (int i=0; i<n; i++){
            arry[i]=Integer.parseInt(st.nextToken());
           if (arry[i]<x){
               bw.write(arry[i]+" ");
           }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
