package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue

        for (int i = 2; i < 10; i++ ) {         // 바깥 반복문: i는 2부터 9까지 1씩 증가
            for (int j = 2; j < 10; j++ ) {     // 안쪽 반복문: j는 2부터 9까지 1씩 증가
                if (i * j >= 30) {              // 반복문의 곱셈 결과가 30이상이면
                    continue;                   // 아래 코드는 실행하지 않고 넘어감.
                }
                System.out.print(i + "*" + j + "=" + i * j + "\t"); // \t 는 문자 간격 띄어쓰기
            }
            System.out.println();
        }
    }
}
