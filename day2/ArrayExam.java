package day2;

public class ArrayExam {
    public static void main(String[] args) {

        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i <= 9; i++)
            System.out.println(arr[i]);

        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr2 = {1,2,3,4,5};

        for (int j = 0; j <= 4; j++) {
            System.out.println(arr2[j]);
        }

        // 배열 거꾸로 출력
        int[] arr3 = {1, 2, 3, 4, 5};

        for (int i = arr3.length - 1; i >= 0 ; i--) {
            System.out.println(arr3[i]);
        }

        // 배열 안의 숫자들의 합을 구해주세요.

    }
}
