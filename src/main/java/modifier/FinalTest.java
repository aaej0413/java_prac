package modifier;

/*
final - 마지막의, 변경될 수 없는
final 클래스
    - 변경될 수 없는 클래스, 확장할 수 없는 클래스가 된다.
    - 그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
final 메서드
    - 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
final 멤버변수,지역변수
    - 변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 된다.
 */
final class FinalTest {     // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10;    // 값을 변경할 수 없는 멤버변수(상수)

    final int getMaxSize() {    // 오버라이딩 할 수 없는 메서드(변경 불가)
        final int LV = MAX_SIZE;    // 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE;
    }
}
