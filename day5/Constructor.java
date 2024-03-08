package day5;

public class Constructor {
    public static void main(String[] args) {

        사람 a사람 = new 사람(20, "홍길동", "서울");

        // 객체의 데이터 세팅 => 객체 초기화
//        aPerson.age = 20;
//        aPerson.name = "홍길동";
//        aPerson.home = "서울"; // 객체가 올바르게 작동하는데 데이터가 반드시 필요하다.

//        aPerson.reset(20, "홍길동", "서울");
//
        a사람.자기소개();

        사람 b사람 = new 사람(30, "홍길순", "부산");

//        bPerson.age = 30;
//        bPerson.name = "홍길순";
//        bPerson.home = "부산";

//        bPerson.reset(30, "홍길순", "부산"); // 객체 초기화는 꼭 필요한데 실수로 누락할 수 있다.

        b사람.자기소개();

        int age = 20;
        String name = "홍길동";
        System.out.println("안녕하세요 " + age + "살입니다");

        // %d : 정수
        // %s : 문자열
        // %f : 실수
        System.out.printf("안녕하셍 %d살 %s입니다. 몸무게는 %f kg 입니다.\n", age, name, 68.5);
    }
}

class 사람 {
    int age;
    String name;
    String home;

    // 생성자 => 객체가 생성될 때 자동으로 호출되는 메소드
    // 작성 규칙 => 리턴타입X, 이름은 무조건 클래스이름과 동일하게

    public 사람 (int age, String name, String home) {
        System.out.println("사람이 한명 만들어집니다.");
        this.age = age;
        this.name = name;
        this.home = home;
    }

    // public Person () {} // 기본 생성자, 안만들면 자바가 자동으로 만들어줌.
    //다만, 내가 생성자를 의도적으로 만들면 자바는 기본생성자를 더이상 자동 생성해주지 않는다.

    // 함수의 지역변수와 객체의 인스턴스 변수는 동일한 이름으로 존재 가능
//    public void reset (int age, String name, String home) {
//        // this는 객체를 가리킨다.
//        this.age = age;
//        this.name = name;
//        this.home = home;
//
    public void 자기소개 () {
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다.");
    }

}
