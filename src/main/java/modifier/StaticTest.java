package modifier;

/*
static - 클래스의, 공통적인
static 멤버변수
    - 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다.
    - 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능하다.
    - 클래스가 메모리에 로드될 때 생성된다.
static 메서드
    - 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드가 된다.
    - static메서드 내에서는 인스턴스 멤버들을 직접 사용할 수 없다.
 */
public class StaticTest {

    static int width = 200; // 클래스 변수(static 변수)
    static int height = 120; // 클래스 변수(static 변수)

    static {                // 클래스 초기화 블럭
        // static변수의 복잡한 초기화 수행
    }

    static int max(int a, int b) {  //클래스 메서드(static 메서드)
        return a > b ? a: b;
    }
}
