package day3;

public class 자동차 {
    String car;

    public void go (int n) {
        String str = "번";
        if (n <= 0) {
            System.out.println(car + "가 " + "달립니다.");
        }
         else if (n>0)
            System.out.println(car + "가 " + n + str + " 달립니다.");
    }
    public void speed (int n) {
        System.out.println(car + "가 최대속력 " + n + "Km로 달립니다.");
    }
}
