package loop;

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = sc.next();
                System.out.print("상품의 가격을 입력하세요: ");
                int p = sc.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int c = sc.nextInt();
                System.out.println("상품명: " + name + " 가격: " + p + " 수량: " + c + " 합계: " + p*c);
                sum += p*c;
            } else if (option == 2) {
                System.out.println("총 비용: " + sum);
                sum = 0;
            } else if (option == 3) {
                System.out.print("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
