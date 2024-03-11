package day6;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

        // 배열의 단점

        int[] arr = new int[10];

        arr[0] = 10; // 0번째 인덱스 사용

        arr[9] = 100; // 9번째 인덱스 사용

        // 배열은 크기가 고정이라 유연하지 않다.

        // 동적배열 => 길이를 정하지 않고 유동적으로 변하게 함.
        // 동적배열 (ArrayList)은 객체만 저장 가능.

        // 원시타입 => int, double, boolean, char
        // 원시타입을 제외한 자바의 모든 것은 객체이다.
        // 원시타입에 객체타입 존재.
        // int => Integer
        // double => Double
        // boolean =>Boolean
        ArrayList<Integer> list = new ArrayList<>(); // int ArrayList

        list.add(10); // 0번째 인덱스에 10을 추가
        list.add(20); // 1번째 인덱스에 20을 추가
        list.add(30); // 2번째 인덱스에 30을 추가

        // 값 가져오기
        int rst = list.get(1);
        System.out.println(rst);

        // 값 삭제하기
        list.remove(1); //1번째 인덱스의 값을 삭제. 값이 지워진 인덱스 이후 값들로 당겨진다.

        System.out.println(list.get(1)); // 30

        // ArrayList의 크기 확인
        System.out.println(list.size()); // 2

        // ArrayLsit의 모든 값 출력
        // 마지막인덱스는 항상 개수 -1
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
        // ArrayList의 사이즈를 출력해주세요.
        // ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 )
        // 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
        // List의 모든 값을 출력해주세요.


    }
}
