package doit.chap1;

import java.util.Scanner;

public class Quiz15 {
    static void triangleLB(int n) { //왼쪽 아래가 직각
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) { //왼쪽 위가 지각
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(' ');
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("직각 이등변 삼각형을 출력합니다.");
        System.out.print("a의 값을 지정해주세요: ");
        int a = scanner.nextInt();
        System.out.println("왼쪽 아래가 직각");
        triangleLB(a);
        System.out.println("왼쪽 위가 직각");
        triangleLU(a);
        System.out.println("오른쪽 위가 직각");
        triangleRU(a);
        System.out.println("오른쪽 아래가 직각");
        triangleRB(a);
    }
}
