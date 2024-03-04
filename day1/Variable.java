package day1;

import java.io.FilterOutputStream;

public class Variable {
    public static void main(String[] args) {
        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        // 변수 선언
        // 변수타입 변수명;

        // 숫자형 변수 선언
        // int 는 정수를 의미
        int number;

        // 변수에 값 저장
        number = 40; // 변수가 왼쪽, 저장 대상이 오른쪽
        // 40 = number; // 불가

        // int number2;
        // number2 = "이순재" // 숫자형 변수에 문자 저장은 불가

        // String 은 자바에서 문자열을 의미
        String str;
        str = "이순재";

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);


        String name;
        name = "이성재";

        int age;
        age = 28;



        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");

        // 변수 주의 사항
        // 변수명은 중복되지 않도록 지어야 한다.
        // 변수명은 숫자로 시작하면 안된다.
        // 변수는 재활용 가능하다



    }
}



