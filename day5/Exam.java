package day5;

public class Exam {
    public static void main(String[] args) {

        // 문제 : 아래가 오류없이 실행되도록 해주세요.
        // 조건 : 사람 클래스만 수정할 수 있습니다.

        new 사람2();
        // 아래와 같이 출력되게 해주세요.

        // 동물(String 이름, int 나이) 실행됨!
        // 이름 : 홍길동
        // 나이 : 27
    }
}
class 동물1 {
    public 동물1 () {
    }

    public 동물1(String 이름) {
        System.out.println("동물1(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    public 동물1(String 이름, int 나이) {
        System.out.println("동물1(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람2 extends 동물1 {
    public 사람2 () {
        super("홍길동", 27);

    }
}