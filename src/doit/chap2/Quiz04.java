package doit.chap2;

import java.util.Scanner;

public class Quiz04 {

    static void copy(int[] a, int[] b){
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++)
            b[i] = a[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("b의 요소수를 입력하세요");
        int bn =scanner.nextInt();
        int barray[] = new int[bn];


        System.out.print("a의 요소수를 입력하세요");
        int an = scanner.nextInt();
        int aarray[] = new int[an];

        for (int i =0; i<an; i++){
            System.out.print("a["+i+"] = ");
            aarray[i] = scanner.nextInt();
        }

        for (int i =0; i<bn; i++){
            System.out.print("b["+i+"] = ");
            barray[i] = scanner.nextInt();
        }

        copy(aarray,barray);
        System.out.println("배열 b의 모든 요소를 배열 a에 복사한 값은");
        for (int i =0; i<aarray.length; i++){
            System.out.print(aarray[i]);
        }

    }
}
