package doit.chap1;

public class Quiz02 {
    public static int min3(int a, int b, int c){
        int min = a;
        if (min > b){
            min = b;
        }
        if (min > c){
            min = c;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(min3(50,44,99));

    }
}
