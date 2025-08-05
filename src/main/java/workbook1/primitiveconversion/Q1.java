package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
    }
}

/// 사고흐름
///1. 사용자로부터 정수 a와 b를 입력받음
///2. 정수 a와 b를 double로 자동 형변환하여 더함
///3. 변환된 double 타입의 합을 (int)로 강제 형변환하여 출력