package method;

public class MethodEx02 {
    public static void main() {
        pringHeader();
        sum(1,2);
    }

    public static void pringHeader() {
        System.out.println("프로그램을 종료합니다.");
    }

    public static void sum(int a, int b) {
        int num = a+b;
        System.out.println(num);
        return;
    }
}
