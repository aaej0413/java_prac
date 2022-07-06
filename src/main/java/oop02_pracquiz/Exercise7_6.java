package oop02_pracquiz;
/*
Outer클래스의 내부 클래스 Inner의 멤버변수 iv값 출력해보기.
    - 인스턴스 클래스의 인스턴스를 생성하려면, 외부 클래스의 인스턴스를 먼저 생성해야 한다.
 */
class Outer {
    class Inner {
        int iv = 100;
    }
}
public class Exercise7_6 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner ii = outer.new Inner();

        System.out.println(ii.iv);
    }
}
