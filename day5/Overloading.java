package day5;

public class Overloading {
    public static void main(String[] args) {

        계산기 a계산기 = new 계산기();
        int rst = a계산기.더하기(1,2);
        System.out.println(rst);
        int rst2 = a계산기.더하기(3,4,3);
        System.out.println(rst2);
        double rst3 = a계산기.더하기(3.4,54.8);
        System.out.println(rst3);

    }
}
// 메소드의 이름이 같아도 매개변수의 타입이 다르거나 개수가 다르면 다른 함수로 인식한다. => 오버로딩
class  계산기 {
    int 더하기 (int num1, int num2) {
        return num1 + num2;
    }
    int 더하기 (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    double 더하기 (double num1, double num2){
        return num1 + num2;
    }
}