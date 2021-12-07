package doit.chap1;

import java.util.Scanner;

public class Quiz01 {
    public static int max4(int a, int b, int c, int d){
        int max = a;
        if (max<b){
            max = b;
        }
        if (max<c){
            max = c;
        }
        if (max<d){
            max = d;
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("a의 값을 입력해주세요 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값을 입력해주세요 : ");
        int b = scanner.nextInt();
        System.out.print("c의 값을 입력해주세요 : ");
        int c = scanner.nextInt();
        System.out.print("d의 값을 입력해주세요 : ");
        int d = scanner.nextInt();
        System.out.println("최대값은 = "+max4(a,b,c,d));

    }
}
