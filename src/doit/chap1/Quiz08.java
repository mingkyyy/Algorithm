package doit.chap1;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 합을 구할 숫자를 입력하세요: ");
        int n = scanner.nextInt();
        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        System.out.println(sum);

    }
}
