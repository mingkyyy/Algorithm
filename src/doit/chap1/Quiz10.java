package doit.chap1;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        if (a > b) {
            do {
                System.out.println("a 보다 큰 값을 입력하세요!");
                System.out.print("b의 값: ");
                b = scanner.nextInt();
            } while (a > b);

        }
        System.out.println("b - a는"+(b-a)+"입니다.");

    }
}
