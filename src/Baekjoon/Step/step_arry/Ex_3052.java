package Baekjoon.Step.step_arry;

import java.util.Scanner;

public class Ex_3052 {
    public static void main(String[] args)throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int result = 0;
        int count = 0;

        for ( int i = 0; i < 10; i++ ) {
            arr[i] = scanner.nextInt() % 42;
        }

        for ( int i = 0; i < 10; i++ ) {
            result = 0;
            for ( int j = i+1; j < 10; j++ ) {
                if ( arr[i] == arr[j] ) {
                    result ++;
                }
            }
            if ( result == 0 ) {
                count ++;
            }
        }

        System.out.println(count);

    }
}