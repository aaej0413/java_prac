package oop02_pracquiz;
/*
Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력해보기.
    - 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
 */
class Outer2 {
    static class Inner {
        int iv =200;
    }
}
public class Exercise7_7 {
    public static void main(String[] args) {
        Outer2.Inner ii = new Outer2.Inner();
        System.out.println(ii.iv);
    }
}
