package Exam;

public class OperatorExam1 {


    public static void main(String[] args) {

        String t = "참";
        String f = "거짓";

        if (true) {
            System.out.println(t);
        }

        if (false) {
            System.out.println(f);
        }

        int a = 10;
        // `==` => 같다.
        if (a == 10) {
            System.out.println(t);
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println(f);
        }

        if (a > 10) {
            System.out.println(f);
        }

        if (a >= 10) {
            System.out.println(t);
        }

        int b = 10;

        if (a == b) {
            System.out.println(t);
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if (c) {
            System.out.println(f);
        }

        if (c == false) {
            System.out.println(t);
        }

        // `!` => 반전
        if (!c) {
            System.out.println(t);
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println(f);
        }

        boolean d = true;

        if (c != d) {
            System.out.println(t);
        }

    }
}


