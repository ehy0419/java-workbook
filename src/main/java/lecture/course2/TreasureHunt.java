package main.java.lecture.course2;

/**
 * 코드 해설
 * exploration:: 이것은 **레이블(Label)**입니다. break나 continue가 어떤 반복문을 대상으로 할지 지정해주는 이름표 같은 역할을 합니다. 여기서는 바깥쪽 for문에 붙여서, 안쪽 for문에서 break exploration;이 호출될 때 바깥쪽 for문까지 한 번에 탈출하도록 만들었습니다.
 *
 * if (currentRoomNumber < 0): 방의 숫자가 음수인지, 즉 '함정'인지 확인하는 조건문입니다.
 *
 * continue;: 조건이 참이면 continue가 실행됩니다. continue는 현재 실행 중인 반복(안쪽 for문)의 나머지 부분을 모두 건너뛰고, 바로 다음 차례(j가 1 증가)로 넘어가게 합니다.
 *
 * if (currentRoomNumber > 10 && currentRoomNumber % 3 == 0): '황금 열쇠'의 조건(10보다 크고 3의 배수)을 확인하는 조건문입니다.
 *
 * break exploration;: 위 조건이 참이면, 열쇠 정보를 변수에 저장한 뒤 break를 호출합니다. 그냥 break;를 썼다면 안쪽 for문만 탈출했겠지만, break exploration;이라고 썼기 때문에 exploration: 레이블이 붙은 바깥쪽 for문까지 완전히 종료시켜 불필요한 탐사를 막아줍니다.
 *
 * if (keyFound): 모든 반복문이 끝난 후, keyFound 변수의 값에 따라 열쇠를 찾았는지 여부를 판단하여 최종 결과를 출력합니다.
 */
public class TreasureHunt {
    public static void main(String[] args) {
        int[][] rooms = {
                {1, 5, -3, 8},
                {10, 2, 7, -1},
                {4, 15, 9, 21},
                {12, -5, 6, 18}
        };

        boolean keyFound = false;
        int keyNumber = 0;
        int keyRow = -1;
        int keyCol = -1;

        // 1. 중첩 반복문을 시작합니다. '탐사'라는 의미의 레이블을 붙여줍니다.
        //    이 레이블은 break와 함께 쓰여 모든 반복을 한 번에 중단시키는 역할을 합니다.
        exploration: // 레이블(Label)
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                int currentRoomNumber = rooms[i][j];
                System.out.printf("탐사 중: %d행 %d열 (숫자: %d)\n", i, j, currentRoomNumber);

                // 2. 조건문: 함정인지 확인합니다.
                if (currentRoomNumber < 0) {
                    System.out.println(">> 함정 발견! 이 방을 건너뜁니다.");
                    continue; // 현재 방의 탐사를 중단하고 다음 방으로 넘어갑니다.
                }

                // 3. 조건문: 황금 열쇠의 조건을 확인합니다.
                if (currentRoomNumber > 10 && currentRoomNumber % 3 == 0) {
                    keyFound = true;
                    keyNumber = currentRoomNumber;
                    keyRow = i;
                    keyCol = j;

                    System.out.println(">> 황금 열쇠 발견! 탐사를 중단합니다.");
                    break exploration; // 'exploration' 레이블이 붙은 반복문 전체를 즉시 중단합니다.
                }
            }
        }

        // 4. 최종 결과를 출력합니다.
        System.out.println("\n--- 탐사 종료 ---");
        if (keyFound) {
            System.out.printf("%d행 %d열에서 황금 열쇠(%d)를 찾았습니다! 전설의 보물 상자를 엽니다.\n", keyRow, keyCol, keyNumber);
        } else {
            System.out.println("모든 방을 탐사했지만 황금 열쇠를 찾지 못했습니다.\n");
        }
    }
}