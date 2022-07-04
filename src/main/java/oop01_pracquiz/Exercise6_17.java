package oop01_pracquiz;

import java.util.Arrays;

public class Exercise6_17 {
    /*
    메서드명 : shuffle
    기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다 .
           처리한 배열을 반환한다.
    반환타입 : int[]
    매개변수 : int[] arr - 정수값이 담긴 배열
     */

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }

    private static int[] shuffle(int[] arr) {

        if (arr == null || arr.length == 0)
            return arr;

        for(int i=0; i< arr.length;i++) {
            int j = (int)(Math.random()*arr.length); // random함수는 기본이 double이라 int로 형변환 해줌.

            // arr[i] arr[j] . 와 의 값을 서로 바꾼다

            int tmp = arr[i]; // 1.tmp = 1 / 2.tmp = 2
            arr[i] = arr[j];  // 1.arr[5, , , , , , , , ] / 2.arr[5,8, , , , , , , ]
            arr[j] = tmp;  // 1.arr[ , , , ,1, , , , ] / 2. arr[ , , , ,1,2, , , , ]
        }
        return arr;
    }
}
