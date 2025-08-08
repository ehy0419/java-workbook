package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자 n까지의 수 중 3의 배수의 합을 구하는 프로그램입니다.");
//        System.out.print("숫자를 입력해주세요: ");
//        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력

        // do-while??? 낯설다 너...
        /// while 문과 비교
        //while - 조건식이 참 일 때 코드가 실행되는 것
        //do while - 무조건 한 번 이상 실행되는 것

        ///  테스트
        int num = 6;
        do {
            System.out.println("6이에용");
            num++;
        } while (num <= 5);
        System.out.println("작동하나요?");
    }
}
