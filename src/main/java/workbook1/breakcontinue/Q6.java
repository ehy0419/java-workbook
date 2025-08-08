package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력

        Q6loop:     // 문제Q6 라벨 지정
        for (int num = 1; num <= 50; num++) {
            if (num >= 40) {
                break Q6loop;       // 값이 40 이상이면 break
            }

            if ((num & 3) == 0 && (num & 5) != 0) {  // 3의 배수이지만 5의 배수가 아닌 값을 동시에 충족하는 값
                continue Q6loop;       // 3의 배수가 아니거나 5의 배수면 생략
            }

            sum += num;
        }

        System.out.println("최종 합: " + sum);
    }
}