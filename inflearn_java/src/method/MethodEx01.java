package method;

public class MethodEx01 {  // 같은 클래스 안에 main()과 add() 각각 따로 선언
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        // 메서드 오버로딩
        double sum3 = add(10, 20, 30);
        System.out.println("결과3 출력: " + sum3);

        double sum2 = 1.5;
        pringNumber((int) sum2);  // double이 int에 들어갈 수 없어서 명시적 형변환 시킴

    }  // ← 여기서 main 메서드가 끝남

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }  // ← add 메서드가 끝남

    public static int add(int a, int b, int c) {
        System.out.println(a + "+" + b + "+" + c + " 연산 수행");
        int sum = a + b + c;
        return sum;
    }  // 메서드 오버로딩

    public static void pringNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
