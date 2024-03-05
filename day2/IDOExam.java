package day2;

public class IDOExam {
    public static void main(String[] args) {
        // 문제 : 1부터 100까지 출력해주세요.

        for (int a = 1; a <= 100; a++) {
            System.out.println(a);
        }

        // 문제1. 1 ~ 100까지 수중 짝수만 출력

        for (int b = 1; b <= 100; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
        // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
        for (int c = 1; c <= 100; c++) {
            if (c % 2 == 0) {
                System.out.println(c + " even");
            }
            if (c % 2 == 1) {
                System.out.println(c + " odd");
            }
        }
        //  축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고
        //  현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.
        //  손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
        //  만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
        //  (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)
        //  현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.

        int time = 74;
        int score = 0;


        //    a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        //    오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        //    ex )
        //    오름차순 :  1, 2, 3, 4, 5
        //    내림차순 :  5, 4, 3, 2, 1

        int a = 12;
        int b = 5;


        for (int dan = 2; dan <= 10; dan++) {
            for (int i = 2; i <= 9; i += 2) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        }

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int dan = 5; dan <= 20; dan += 2) {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        }


    }
}