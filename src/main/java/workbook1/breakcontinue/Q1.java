package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // 합을 출력
    }
}

/// 사고흐름
//1. 숫자 num은 1부터 시작해서 100까지 증가 (이 때, 숫자는 정수)
//2. 숫자 num은 10의 배수인지 확인 (num%10 == 0) - 나머지 연산자 확인
//3. 10의 배수가 나오기 직전까지의 합을 저장
//4. break로 반복 종료
//5. 그 이전까지의 합을 출력