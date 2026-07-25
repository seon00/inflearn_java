package method;

public class MethodEx01 {  // 같은 클래스 안에 main()과 add() 각각 따로 선언
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);
    }  // ← 여기서 main 메서드가 끝남

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }  // ← add 메서드가 끝남
}
