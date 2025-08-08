package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // TODO 풀어서 : 1부터 숫자를 증가시키며 누적 합을 구하다가, 10의 배수가 나타나면 반복을 종료 한다.

        /// 사고흐름
//1. 숫자 num은 1부터 시작해서 100까지 증가 (이 때, 숫자는 정수)
//2. 숫자 num은 10의 배수인지 확인 (num%10 == 0) - 나머지 연산자 확인
//3. 10의 배수가 나오기 직전까지의 합을 저장
//4. break로 반복 종료
//5. 그 이전까지의 합을 출력

        /// for 문 안에서 num 선언
        int sum1 = 0;        // 누적 합을 저장할 변수 초기화
                            // 누적 합을 계속 더하려면 sum 이라는 변수 상자가 필요하다.
                            // 하지만 변수를 사용하려면 반드시 초기값이 있어야한다.

        // num은 1부터 시작하여 100까지 1씩 증가
        for (int num = 1; num <= 100; num++) {

            if (num % 10 == 0) break;
            // num이 10의 배수이면 반복문을 중단하여 더 이상 sum에 더하지 않음
            // 반복문(for, while 등) 전체를 즉시 종료시킴

            /// 주의
            // sum += num; 을 for 문 밖에서 쓰고 싶으면
            // int num; 을 먼저 선언해주어야 한다.
            // 여기에서는, for문 안에서 num을 `int num`으로 선언해준다.

            sum1 += num;  //은 반드시 break보다 먼저 실행되어야 함
                        // 그렇지 않으면 10의 배수도 sum에 포함되므로 문제의 조건에 어긋남
                        // 10의 배수가 나오기 전까지 num 을 sum에 더함.
        }
        // 누적 합을 출력
        // sum 은 1부터 9까지의 합 : 45
        System.out.println("for 문 안에서 num 선언 -> 합 : " + sum1); // 초기화된 sum 적용 // 합 : 45

        ///  for 문 밖에서 num 선언 (나중에 외부에서 num 사용 가능)
        int sum2 = 0;
        int num = 0; // 반복문 바깥에서 미리 선언

        for (num = 1; num <= 100; num++) {
            if (num % 10 == 0) break;
            sum2 += num;
        }

        System.out.println("for 문 밖에서 num 선언 -> 합 : " + sum2); // 합 : 45
        System.out.println("반복 종료 시 num 값 : " + num); // 10

    }
}
