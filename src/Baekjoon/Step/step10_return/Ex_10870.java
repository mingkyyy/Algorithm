package Baekjoon.Step.step10_return;

import java.util.Scanner;

public class Ex_10870 {
    public static int fivo(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }else
        return fivo(n-1)+fivo(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fivo(n));

    }
}
