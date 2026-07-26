package method;

import java.util.Scanner;

public class MethodEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최초 금액을 입력하세요 : ");
        int balance = sc.nextInt();

        while(true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 종료");
            int num = sc.nextInt();
            if(num == 1) {
                System.out.print("입금 할 금액을 입력하세요: ");
                int price = sc.nextInt();
                balance = deposit(balance, price);
            } else if (num == 2) {
                System.out.print("출금 할 금액을 입력하세요: ");
                int price = sc.nextInt();
                balance = withdraw(balance, price);
            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못입력하였습니다.");
            }
        }
        System.out.println("최종 잔액: " + balance);
    }

    public static int deposit(int balance, int input){ // 입금 메서드
        int total = balance + input;
        System.out.println(input + "원을 입금하였습니다. 현재 잔액: " + total + "원");
        return total;
    }

    public static int withdraw(int balance, int output){ // 출금 메서드
        int total = balance - output;
        if (total >= 0) {
            System.out.println(output + "원을 출금하였습니다. 현재 잔액: " + total + "원");
            return total;
        } else {
            System.out.println(output + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }
}
