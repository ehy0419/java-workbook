package main.java.workbook1.operators;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: a += b * c 연산 후 a, b, c 출력
        // 세 개의 정수 입력 받기
        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();
        System.out.print("정수 c: ");
        int c = sc.nextInt();

        // 복합대입 연산자 사용 a += b * c
        a += b * c;

        //a += b * c;
        /// == a = a + (b * c);
        //즉,
        //먼저 b * c를 계산합니다.
        //그 결과를 a에 더한 다음,
        //그 값을 다시 a에 저장합니다.

        //예시
        //int a = 2;
        //int b = 3;
        //int c = 4;
        ///a += b * c;
        //작동 방식
        //b * c → 3 * 4 → 12
        //a + 12 → 2 + 12 → 14
        //a = 14
        //결과적으로 a의 값은 14가 됩니다.


        // 입력 결과
        System.out.println("결과: " + a + " " + b + " " + c);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

///문제 분석
// 입력처리
// 복합대입 연산자 사용 a += b * c
// 입력 테스트
//조건 : 원본 b, c 변경 금지!