package day2;

public class ArrayExam {
    public static void main(String[] args) {

        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr2 = new int[10];

        for(int i = 0; i < 10 ; i++) {
            arr2[i] = (i + 1) * 10;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }

        // 배열 거꾸로 출력
        int[] arr3 = {1, 2, 3, 4, 5};

        for (int i = arr3.length - 1; i >= 0 ; i--) {
            System.out.println(arr3[i]);
        }

        // 배열을 두번 출력해주세요.
        int[] arr = {1,2,3,4,5};

        for(int j = 0; j < 2; j++) {

            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        }

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        // 순번.순서 --> 인덱스
        System.out.println(arr[4]);
        System.out.println(arr[3]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);

        for(int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }



		/*
		아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/
        // 배열 안의 숫자들의 합을 구해주세요.
        int[] arr4 = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < arr4.length; i++) {
            sum += arr4[i];
        }

        System.out.println(sum);



    }
}
