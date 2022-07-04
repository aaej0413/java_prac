package modifier;

/*
abstract - 추상의 미완성의
abstract 클래스
    - 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
abstract 메서드
    - 선언부만 작성하고 구현부는 장성하지 않은 추상 메서드임을 알린다.
 */
abstract class AbstractTest {       // 추상 클래스(추상 메서드를 포함한 클래스)

    abstract void move();           // 추상 메서드(구현부가 없는 메서드)


    // AbstractTest a = new AbstractTest(); -> 에러. 추상클래는 인스턴스 생성불가.
}
