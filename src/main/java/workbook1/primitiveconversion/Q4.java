package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
    }
}

/// 사고흐름 (입력받기 안내는 생략)
//1. f1을 int 로 강제 형변환하여 소수점 제거
//2. f2을 double로 자동 형변환하기
//3. 그 결과를 합산해서 doulbe로 출력