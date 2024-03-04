package day1;

public class Print {
    public static void main(String[] args) {

        // \n은 줄바꿈
        System.out.println("안녕하세요\n반갑습니다.");

        // 문자열 합치기(+)
        System.out.println("안녕하세요"+" 이순재입니다.");
        System.out.println("안녕하세요"+" 이순재입니다"+" 반갑습니다");

        // 숫자 더하기 (산술 연산)
        System.out.println(100 + 200);
        System.out.println(2135 + 24578);

        System.out.println("100");
        System.out.println(100);

        // 숫자와 문자는 정확히 구별해서 사용
        System.out.println("100" + "200"); //문자로 인식. 연산 불가
        System.out.println(100 + 200); //숫자로 인식. 연산 가능

        // 문자 + 숫자는 숫자를 문자화 해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        // +연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("123123 + 456456 = " + 123123 + 456456);
        System.out.println("123123 + 456456 = " + (123123 + 456456));

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        // 출력문을 한개만 사용하여 구구단 2단 표현
        System.out.println("2 X 1 = " + (2 * 1) +
                "\n2 X 2 = " + (2 * 2) +
                "\n2 X 4 = " + (2 * 4) +
                "\n2 X 5 = " + (2 * 5) +
                "\n2 X 6 = " + (2 * 6) +
                "\n2 X 7 = " + (2 * 7) +
                "\n2 X 8 = " + (2 * 8) +
                "\n2 X 9 = " + (2 * 9));
    }
}