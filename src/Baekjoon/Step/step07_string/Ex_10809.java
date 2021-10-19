package Baekjoon.Step.step07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_10809 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[26];

        for (int i=0; i<array.length; i++){
            array[i] = -1;
        }
        String st = br.readLine();
        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);

            if (array[ch - 'a'] == -1){
                array[ch - 'a'] = i;
            }
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
