package day3;

public class ParameterExam {

    public static void print (int num1) {
        System.out.println(num1);
    }
    public static void introduce (int num1, String str1, int num2) {
       for (int i = 1 ; i <=num2 ; i++) {
           System.out.println("안녕하세요. 저는 " + num1 + "살 " + str1 + "입니다.!");
       }
    }
    public static void greeting1 (int num1) {
        if (num1 == 2) {
            System.out.println("하이~");
        }
        if (num1 == 3) {
            System.out.println("봉쥬");
        }
        if (num1 == 1) {
            System.out.println("안녕하세요");
        }
    }
    public static void greeting2 (int num1, int num2) {
        for (int i = 1; i <= num2 ; i++) {
            if (num1 == 2) {
                System.out.println("하이~");
            }
            if (num1 == 3) {
                System.out.println("봉쥬");
            }
            if (num1 == 1) {
                System.out.println("안녕하세요");
            }
        }
    }
    public static void main(String[] args) {

        print(4); // 출력: 4
        print(10); // 출력: 10
        print(100); // 출력: 100

        introduce(27, "이순재",2);
        // 안녕하세요. 저는 20살 이순재입니다.! 2번 출력

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬



    }















}
