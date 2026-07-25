package array;

import java.util.Scanner;

public class ArrayEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int n = sc.nextInt();
        int[][] students = new int[n][3];
        String[] sub = {"국어", "영어", "수학"};

        int[] st_sum = new int[n];

        for(int i=0; i<students.length; i++) {
//             int sum = 0;
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
            for(int j=0; j<students[i].length; j++) {
                System.out.print(sub[j] + " 점수:");
                students[i][j] = sc.nextInt();
//                 sum += students[i][j];
                st_sum[i] += students[i][j];
            }
//             st_sum[i] = sum;
        }
        for(int i=0; i<students.length; i++) {
            System.out.println((i+1) + "번 학생의 총점: " + st_sum[i] + ", 평균: " + (double) st_sum[i]/ students[i].length);
        }
    }
}
