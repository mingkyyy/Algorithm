package doit.chap2;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {

    static int maxOf(int[] a){
        int max = a[0];
        for (int i =0; i<a.length; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Random random1 = new Random();
        int person = 1+random1.nextInt(20);
        int height[] = new int[person];

        System.out.println("키의 최댓값을 구합니다");
        System.out.println("사람의 수: "+person);
        System.out.println("키 값은 아래와 갔습니다.");
        for (int i=0; i<person; i++){
            height[i] = 100+random.nextInt(90);
            System.out.println("height[ "+i+" ]: "+height[i]+ " 입니다.");

        }
        System.out.println("최대값은 : "+maxOf(height));
    }
}
