package Baekjoon.Step.step07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] strings = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i < strings.length; i++) {
            if (s.contains(strings[i])) {
                s = s.replaceAll(strings[i], "a");
            }
        }
        System.out.println(s.length());
    }
}
