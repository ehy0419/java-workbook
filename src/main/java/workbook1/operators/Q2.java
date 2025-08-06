package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 전위 증가와 후위 증가 결과 출력
        //1. 하나의 정수 입력 받기
        System.out.println("정수를 입력해주세요: ");
        int num = sc.nextInt();

        //2. 전위 증가 ++i
        // 전위 증가 : 주어진 변수를 먼저 증가시키고 그 결과를 사용한다.
        int preInc = ++num;

        //3. 후위 증가 i++
        // 후위 증가 : 주어진 변수를 먼저 사용하고 이후에 증가시킨다.
        int postInc = num++;

        //4. 결과 출력
//        System.out.println(preInc + " " + num + " " + postInc); // 6 7 6
        System.out.println(preInc + " " + postInc); // 6 6
    }
}

/// 문제 분석
// 하나의 정수를 입력 받기
// 전위 증가값
// 후위 증가값
// 출력은 '6 6' 으로 보아
// 전위 증가값 " " 후위 증가값 출력하기