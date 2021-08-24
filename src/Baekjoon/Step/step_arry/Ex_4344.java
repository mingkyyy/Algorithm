package Baekjoon.Step.step_arry;

import java.util.Scanner;

public class Ex_4344 {
    public static void main(String[] args)throws Exception {
      Scanner sc = new Scanner(System.in);
      int c = sc.nextInt();
      double sum=0.0;
      double avg=0.00;
      double count=0.0;

      for (int i=0; i<c; i++){
          avg=0.0;
          sum=0.0;
          count=0.0;
          int n = sc.nextInt();
          int[] arry = new int[n];
          for (int j=0; j<n; j++){
              arry[j]=sc.nextInt();
              sum+=arry[j];
          }
          avg=sum/n;
          for (int k=0; k<n; k++){
              if (arry[k]>avg){
                  count++;
              }
          }
          System.out.printf("%.3f%%\n",(count/n)*100);
      }

    }
}
