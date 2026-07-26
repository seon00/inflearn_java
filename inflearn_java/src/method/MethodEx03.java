package method;

import java.util.Scanner;

public class MethodEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("평균값: " + aver(1, 2, 3));
        System.out.println("평균값: " + aver(15, 25, 35));

        msg("Hello, world!", 3);

    }

    public static double aver(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;  // 변수 선언 안하고 바로 return 가능
    }

    public static void msg(String a, int b) {
        for(int i=0; i<b; i++) {
            System.out.println(a);
        }
    }

}
