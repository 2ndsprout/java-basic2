package day2;

public class IncDecOperator {
    public static void main(String[] args) {

        // 반복문을 이용해 동일한 명령을 여러번 실행

        // 원하는 만큼만 반복
        int cnt = 0; // 반복횟수 세는 용도

        while (cnt < 5) {
            System.out.println(cnt);
            cnt++;
        }

        // for문
        for (int cnt2 = 0;  cnt2 < 5; cnt2 ++) {
            System.out.println("실행");
        }

        // 1부터 10까지 출력
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 - v1
        for (int i2 = 2; i2 <=10; i2 += 2) {
            System.out.println(i2);
        }

        // 1부터 10까지 짝수 출력 - v2 (2는 짝수이며 2로 나누어짐.연산자는 %)
        for (int i3 = 1; i3 <=10; i3++) {
            if(i3 % 2 == 0) {
                System.out.println(i3);
            }
        }

    }
}
