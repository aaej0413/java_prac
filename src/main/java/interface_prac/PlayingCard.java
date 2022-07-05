package interface_prac;
/*
인터페이스
    - 인터페이스는 일종의 추상클래스이다.
    - 인터페이스는 추상클래스처럼 추상메스드를 갖지만 추상클래스보다 추상화 정도가 높아서 일반 메서드와 멤버변수를
      구성원으로 가질 수 없다.
    - 오직 "추상 메서드"와 "상수"만을 멤버로 가질 수 있으며, 다른 어떤 요소도 허용하지 않는다.
    - 추상 클래스 = 미완성 설계도, 인터페이스 = 기본 설계도

    interface 인터페이스 이름 {
        public static final 타입 상수이름 = 값;
        public abstract 메서드 이름(매개변수 목록)
    }
    -> 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
    -> 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
       단, static 메서드와 디폴트 메서드는 예외(JDK1.8)부터
 */
public interface PlayingCard {

    public static final int SPADE = 4;
    final int DIAMOND = 3;  // public static final int DIAMOND = 3;
    static int HEART = 2;   // public static final int HEARD = 2;
    int CLOVER = 1;         // public static final int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKink();   // public abstract String getCardKind();
}
