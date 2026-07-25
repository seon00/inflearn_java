package array;

import java.util.Scanner;

public class ArrayEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;
        while(true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 초기화 | 4. 종료");
            System.out.print("메뉴를 선택하세요:");
            int num = sc.nextInt();
            if(num == 1 ) {
                if(productCount>9) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = sc.next();
                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = sc.nextInt();
                productCount++;
            }
            if(num == 2) {
                if(productNames[0] == null) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
            }
            if(num == 3) {
                productCount = 0;
                productNames[0] = null;
                System.out.println("초기화 되었습니다.");
                continue;
            }
            if(num == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
