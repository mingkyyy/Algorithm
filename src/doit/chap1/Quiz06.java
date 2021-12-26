package doit.chap1;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다. n의 값을 입력하세요");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i<=n){
            sum +=i;
            i++;

        }
        System.out.println("총 합은 "+sum + " 입니다");
        System.out.println("최종 값의 i는 "+i+" 입니다");
    }
}
