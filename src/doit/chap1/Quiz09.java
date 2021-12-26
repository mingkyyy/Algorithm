package doit.chap1;

import java.util.Scanner;

public class Quiz09 {
    public static int sumof(int a, int b){
        int sum = 0;
        if (a>b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }else {
            for (int i = a; i<= b; i++){
                sum+=i;
            }
        }
           return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a와 b 사이의 숫자 합을 구합니다.");
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();

        System.out.println(a+"와"+b+"사이의 총 합은 "+sumof(a,b)+" 입니다" );

    }
}
