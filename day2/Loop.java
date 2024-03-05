package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문을 이용해 동일한 명령을 여러번 실행

        // 원하는 만큼만 반복
        int cnt = 0; // 반복횟수 세는 용도

//        while (true) {
//            System.out.println("실행");
//            cnt = 1;
//
//        }

        // 증감연산자
        int num = 10;
        System.out.println(num + 5);

        // 변수의 값을 5증가시키고 싶다.
        // num + 15; // 증가X
        num = num + 5;
        num += 5;

        // 변수의 값을 3 감소시키고싶다
        num = num =3;
        num -= 3; //  위와 같음

        // 증감연산자

        num += 1; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다
        num ++; // 위와 같은펴저



    }
}
