package Baekjoon.Step.step07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        String ss = st.nextToken();

        StringBuffer stringBuffer = new StringBuffer(s);
        String s1 = stringBuffer.reverse().toString();
        StringBuffer stringBuffer1 = new StringBuffer(ss);
        String s2 = stringBuffer1.reverse().toString();

        if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }

    }
}
