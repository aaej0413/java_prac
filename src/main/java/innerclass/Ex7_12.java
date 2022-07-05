package innerclass;
/*
내부 클래스의 제어자와 접근성
    - 주로 이벤트 핸들러나 안드로이드 앱을 만들 때 많이 사용한다.
내부 클래스 장점
    1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있게 된다.
    2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킨다..
    3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있다.
 */
public class Ex7_12 {
    class InstanceInner {
        int iv = 100;
//      static int cv = 100;  -> 에러! static변수를 선언할 수 없다.
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;    // static클래스만 static 멤버를 정의할 수 있다.
    }

    void myMethod(){
        class LocalInner {
            int iv = 300;
//          sttic int cv = 300;  -> 에러! static변수를 선언할 수 없다.
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
