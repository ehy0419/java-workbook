package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
    }
}

/// 사고 흐름
//1. Scanner 객체로 사용자로부터 double 실수형 입력을 받음
//2. 변환된 실수 값을 int로 강제 형변환하여 소수점 이하를 버림
//3. 본래 실수 값에서 정수 부분을 뺀 소수점 이하의 값을 계산 - 여기서는 차이를 계산
//4. 결과 출력 (소수점 이하 출력)