package day3;

import java.security.PrivilegedExceptionAction;

public class ReturnExam {
    public static int func1() {

        return 10;
    }

    public static int func2(int num1) {

        return num1;
    }

    public static int func3(int num1) {

        return num1 * num1;
    }

    public static int func4(int num1, int num2) {

        return num1 + num2;
    }

    public static void printEven(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a = func1();
        System.out.println(a);
        // 출력 : 10
        int b = func1();
        System.out.println(b);
        // 출력 : 10

        int c = func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = func4(10 , 30);
        System.out.println(g);
        // 출력 : 40

        int h = func4(20 , 50);
        System.out.println(h);
        // 출력 : 70

        // 0은 양수로 보겠습니다.
        int no = 3;

        if(0>no) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.

        // 1 부터 n까지 수 중 짝수인 것만 출력

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4



    }

}
