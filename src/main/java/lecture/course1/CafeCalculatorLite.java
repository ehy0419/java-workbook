package main.java.lecture.course1;

public class CafeCalculatorLite {
    public static void main(String[] args) {
        // 아래는 입력받은 값, 즉 변수로 가정
        int age = 22;
        boolean isStudent = true;
        char grade = 'B';
        int cups = 3;
        double pricePerCup = 4500.0;

        if (age < 0 || cups <= 0 || pricePerCup < 0) {
            return;
        }

        // 1) 기본 합계
        double total = pricePerCup * cups;

        // 2) 대량 할인
        if (cups >= 3) {
            total *= 0.95; // -5%
        }

        // 3) 멤버십 할인
        if (grade == 'A') {
            total *= 0.90; // -10%
        } else if (grade == 'B') {
            total *= 0.95; // -5%
        }

        // 삼항 연산자 활용 예시
        // double gradeRate = (grade == 'A') ? 0.90 : (grade == 'B' ? 0.95 : 1.0);
        // total *= gradeRate;

        // 4) 학생 할인(중첩 if)
        if (isStudent) {
            if (age <= 25) {
                total *= 0.90; // -10%
            }
        }

        // 5) 반올림 + 형변환
        int pay = (int) (Math.round(total / 10.0) * 10);

        // 6) 포인트(정수 캐스팅)
        int points = (int) Math.round(pay * 0.02);

        System.out.println("최종 결제액: " + pay + "원");
        System.out.println("적립 포인트: " + points + "p");
    }
}
