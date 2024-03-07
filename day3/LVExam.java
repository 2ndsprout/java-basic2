package day3;

import day4.Account;

public class LVExam {

    public static void main(String[] args) {

        // 문제 : 자동차가 3번 달리게 해주세요.
        자동차 c1 = new 자동차();

        c1.car = "1번 자동차";
        자동차 c2 = new 자동차();

        c2.car = "2번 자동차";

        자동차 c3 = new 자동차();
        c3.car = "3번 자동차";



        c1.go(0);
        c1.go(0);
        c1.go(0);

        // 출력 : 자동차가 달립니다.



        //v1. 1개의 자동차가 3번 달리게 해주세요.
        c1.go(3);


        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        c1.go(1);
        c2.go(1);
        c3.go(1);

        //결과 : 자동차가 달립니다.



        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.

        c1.speed(220);
        c2.speed(250);



        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.


        // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

                사람 a사람1 = new 사람();

                a사람1.이름 = "홍길동";
                a사람1.나이 = 22;

                a사람1.자기소개();
                // 출력 : 저는 22살 홍길동 입니다.

                사람 a사람2 = new 사람();

                a사람2.이름 = "홍길순";
                a사람2.나이 = 25;

                a사람2.자기소개();
                // 출력 : 저는 25살 홍길순 입니다.

                a사람1.자기소개();
                // 출력 : 저는 22살 홍길동 입니다.





    }

}
