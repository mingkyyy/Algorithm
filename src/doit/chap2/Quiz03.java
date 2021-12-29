package doit.chap2;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
    static int sumOf(int[] a){
        int sum = 0;
        for (int i =0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(5);
        int array[] = new int[n];


        System.out.println("요소의 개수는 "+n+" 개 입니다.");
        System.out.println("요소의 값을 입력하세요");
        for (int i =0; i<n; i++){
            System.out.print((i+1) +" 번째 : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("요소의 총 합은 "+sumOf(array)+ " 입니다.");


    }
}
