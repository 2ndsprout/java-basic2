package day6;

import java.util.Scanner;

public class StringInputExam {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);

        // 문자열 => 숫자 변환
        System.out.println("100" + 100); // 100100
        int convertedInt = Integer.parseInt("100"); // 숫자로만 이루어진 문자열이 아니면 에러를 일으킨다.
        System.out.println(convertedInt + 100); // 200

        System.out.println("나이를 입력해주세요: ");
        //String age2 = scan2.nextLine();
        //int intAge = Integer.parseInt(age2);

        int age2 = Integer.parseInt(scan2.nextLine());

        System.out.println("이름을 입력해주세요: ");
        String name = scan2.nextLine();

        System.out.printf("안녕하세요 %s세 %s입니다.", age2, name);
    }
}
