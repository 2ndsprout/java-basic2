package day6;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        // 문자열 입력

        Scanner scan = new Scanner(System.in);

        // 문자열 입력1 => 단어 입력
        // 문자열 입력2 => 문장 입력

        /*
        String str1 = scan.next(); // 단어 입력. 공백은 입력이 끝나는 시점으로 인식
        System.out.println(str1);
         */

        // 문장 입력하고 싶으면 nextLine();


        String str2 = scan.nextLine(); // 문장 입력. 엔터를 입력할 때까지 입력을 받음
        System.out.println(str2);



        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        Scanner scan2 = new Scanner(System.in);

        System.out.println("이름을 입력해주세요:");
        String name2 = scan2.nextLine();
        System.out.println("나이를 입력해주세요:");
        int age2 = scan2.nextInt();

        System.out.printf("안녕하세요 %d세 %s입니다. \n", age2, name2);

        System.out.println("나이를 입력해주세요: \n");
        int age = scan2.nextInt();

        scan2.nextLine(); // 버퍼 비우기

        System.out.println("이름을 입력해주세요:");
        String name = scan2.nextLine();

        System.out.printf("안녕하세요 %d세 %s입니다.", age, name);

        // 버퍼 찌꺼기 때문에 입력 꼬이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine으로 통일한다.
    }
}
