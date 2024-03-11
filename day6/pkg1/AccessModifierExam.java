package day6.pkg1;

public class AccessModifierExam {
    public static void main(String[] args) {
        // 문제 : 사람의 id를 출력해주세요.
        // 조건 : 사람의 id를 20으로 설정해주세요.
        // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
        // 조건 : 사람 클래스에서 출력할 수 없습니다.

        Person p1 = new Person();
        p1.setId(20);
        p1.setAge(20);
        p1.setName("홍길동");
        p1.setHome("서울");


        // 구현시작
        System.out.println("저는 "+ p1.getName() + " 이고 나이는 " + p1.printAge() + " 입니다. \n" + "고향은 " + p1.getHome() + " 입니다.");

        // 구현끝

        // 출력 : 제 번호는 20 입니다.

    }
}
class Person {
    private int id;
    private int age;
    private String name;
    private String home;

    // 카멜표기법 : 단어 여러개 조합해서 명명할 때, 의미가 바뀌는 부분에서 대문자를 넣어주는 방식
    // art + insert = >getter, setter
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setHome (String home) {
        this.home = home;
    }
    public String getHome () {
        return home;
    }

    public void setId (int id) {
        this.id = id;
    }
    public int getId () {
        return id;
    }
    public  void setAge (int age) {
        if(age < 0) {
            System.out.println("나이는 음수가 될 수 없습니다.");
        }
        this.age = age;
    }
    public int printAge () {
        return age;
    }

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.



}
