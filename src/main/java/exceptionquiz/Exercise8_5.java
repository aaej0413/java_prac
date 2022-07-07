package exceptionquiz;

public class Exercise8_5 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(5);
        }
    }

    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
    }

    static void method2() {
        throw new NullPointerException();
    }
}
/*
실행결과
3
5
----------------------------------------------------------------------------------------------
- main 메서드가 method1()을 호출하고,
- method1()은 method2()를 호출한다.
- method2()에서 NullPointerException이 발생했는데,
- 이 예외를 처리해줄 try-catch블럭이 없으므로 method2()는 종료되고,
- 이를 호출한 method1()으로 되돌아갔는데 여기에는 try-catch블럭이 있긴 하지만
- NullPointerException을 처리해줄 catch블럭이 없으므로 method1()도 종료되고, 이를 호출한 main메서드로 돌아간다.
- 이 때 finally블럭이 수행되어 '3'이 출력된다.
- main메서드에서는 모든 예외를 처리할 수 있는 Exception이 선언된 catch블럭이 있으므로 예외가 처리되고 '5'가 출력된다.
 */
