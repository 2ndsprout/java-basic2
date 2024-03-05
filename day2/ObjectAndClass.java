package day2;

public class ObjectAndClass {
    public static void main(String[] args) {

        // 객체 -> 폴더

        // 사람 표현
        // 이름, 나이, 거주지

        // 사람 1명
        String name =  "홍길동";
        int age = 20;
        String home = "서울";

        String name2 = "이순신";
        int age2 = 30;
        String home2 = "부산";

        System.out.println(home + " 사는" + age + "살 " + name + " 입니다");
        System.out.println(home2 + " 사는" + age2 + "살 " + name2 + " 입니다");

        // 이순신 정보 복사
        String name3 = name2;
        int age3 = age2;
        String home3 = home2;

        //==================================================================================

        // 홍길동이 자기 정보를 기입
        // 이력서 원본 복사

        Person2 p1 = new Person2();
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        // 복사본에 홍길동의 정보를 기입



        // 이순신이 자기 정보를 기입
        // 이력서 원본 복사

        Person2 p2 = new Person2();
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        // 복사본에 이순신의 정보를 기입

        // 홍길동 자기소개
        System.out.println(p1.home + " 사는" + p1.age + "살  " + p1.name + " 입니다");

        // 이순신 자기소개
        System.out.println(p2.home + " 사는" + p2.age + "살 " + p2.name + " 입니다");

        // 객체 복사
        Person2 p3 = p2;

        // 자동차 1대
        Car2 c1 = new Car2();

        c1.model = "소나타";
        c1.year = 2023;
        c1.price = 3000;

        System.out.println(c1.model + c1.year + c1.price);






    }
}

// 새로운 클래스 생성

class Person2 {
    String name;
    int age;
    String home;

}

class Car2 {
    String model;
    int year;
    int price;

}