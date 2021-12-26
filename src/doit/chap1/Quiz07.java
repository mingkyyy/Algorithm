package doit.chap1;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 n까지 더하는 식입니다. n의 값을 입력하세요 : ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i < n) {
                System.out.print(i + "+");
            }
            else {
                System.out.print(i);
            }
        }
        System.out.println("의 합은 " + sum + "입니다");

    }
}
