package Baekjoon.Step.step10_return;

import java.util.Scanner;

public class Ex_10872 {
        public static int factorial (int a) {
            if(a<2)
                return 1;
            else
                return a * factorial(a-1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int answer = factorial(N);
            System.out.println(answer);
        }
    }
