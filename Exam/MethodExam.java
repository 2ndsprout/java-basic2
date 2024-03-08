package Exam;

public class MethodExam {

    public static void loop() {
        int[] arr3 = {1, 2, 3, 4, 5};

        for (int i = arr3.length - 1; i >= 0 ; i--) {
            System.out.println(arr3[i]);
        }
    }

    public static void hi() {
        System.out.println("안녕하세요. 저는 이순재입니다. 잘부탁드립니다.");
    }
    public static void bye() {
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }
    public static void hi1() {
    System.out.println("저는 차태진 입니다.");
}

    public static void hi2() {
        System.out.println("안녕하세요.");
    }

    public static void hi3() {
        System.out.println("프로그램을 만들어보아요.");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }


    public static void main(String[] args) {

        // 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.

        // 안녕하세요!!
        // 저는 차태진입니다.
        // 자바를 통해
        // 프로그램을 만들어보아요.

        hi1();
        hi2();
        hi3();
        hi4();

        // 안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.
        // 안녕히 가세요. 다음에 또 봐요!

        hi();
        bye();
        loop();


    }
}
