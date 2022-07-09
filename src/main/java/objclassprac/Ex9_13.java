package objclassprac;

import static java.lang.Math.*;

/*
Math의 메서드 예제
 */
public class Ex9_13 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println("round("+ val + ") = " + round(val));    // 반올림

        val *= 100;
        System.out.println("round("+ val + ") = " + round(val));    // 반올림

        System.out.println("round("+ val + ") / 100 = " + round(val)/100);  // 반올림
        System.out.println("round("+ val + ") / 100.0 = " + round(val)/100.0);  // 반올림
        System.out.println("-----------------------------------------------------");

        System.out.printf("ceil(%.1f) = %.1f%n", 1.1, ceil(1.1));   // 올림
        System.out.printf("floor(%.1f) = %.1f%n", 1.5, floor(1.5)); // 버림
        System.out.printf("ceil(%.1f) = %.1f%n", -1.5, ceil(-1.5));   // 올림
        System.out.printf("floor(%.1f) = %.1f%n", -1.5, floor(-1.5)); // 버림
        System.out.printf("round(%.1f) = %d%n", 1.1, round(1.1));    //반올림
        System.out.printf("round(%.1f) = %d%n", 1.5, round(1.5));    // 반올림, 반환 값이 int
        System.out.printf("rint(%.1f) = %f%n", 1.5, rint(1.5));    // 반올림, 반환 값이 double
        System.out.printf("round(%.1f) = %d%n", -1.5, round(-1.5));    // 반올림, 반환 값 -1
        System.out.printf("rint(%.1f) = %f%n", -1.5, rint(-1.5));    // 반올림, 반환 값 -2
    }
}
