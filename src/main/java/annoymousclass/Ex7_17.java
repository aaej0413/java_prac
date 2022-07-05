package annoymousclass;
/*
익명 클래스
    - 익명 클래스는 특이하게도 다른 내부 클래스들과는 달리 이름이 없다.
    - 클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한 번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는
      일회용 클래스이다.
    - 이름이 없기 때문에 생성자도 가질 수 없으며, 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만 구현할 수 있다.
 */
public class Ex7_17 {
    Object iv = new Object() {void  method(){} };   // 익명 클래스
    static Object cv = new Object() { void method() {} };   // 익명 클래스

    void myMethod() {
        Object lv = new Object() {void method() {}};    // 익명 클래스
    }
}
