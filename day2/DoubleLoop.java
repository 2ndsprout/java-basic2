package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("실행");
            System.out.println("됩니다");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.println(j);
            }
        }

        // 구구단 2 ~ 9단 출력

//            System.out.println("2 X 1 = 2");
//            System.out.println("2 X 2 = 4");
//            System.out.println("2 X 3 = 6");
//            System.out.println("2 X 4 = 8");
//            System.out.println("2 X 5 = 10");
//            System.out.println("2 X 6 = 12");
//            System.out.println("2 X 7 = 14");
//            System.out.println("2 X 8 = 16");
//            System.out.println("2 X 9 = 18");

        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

        // 3단
        dan = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

        // 2단부터 9단
        dan = 2;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.println(dan + " X " + j + " = " + (dan * j));
            }
            dan++;
        }





    }
}
