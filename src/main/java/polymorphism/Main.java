package polymorphism;

/*
다형성이란? - 여러가지 형태를 가질 수 있는 능력을 의미하며,
           자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 다형성을 구현하도록 한다.
           이를 좀 더 구체적으로 말하자면, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하는 것이다.
 */
public class Main {
    public static void main(String[] args) {
        SmartTv s = new SmartTv();  // 참조 변수 s와 인스턴스 타입이 일치
        Tv t = new SmartTv();       // 조상 타입 참조변수(t)로 자손 타입의 인스턴스를 참조.
        // SmartTv s = new Tv();    // 에러. 허용 안됨. 자손타입의 참조변수로는 조상타입의 인스턴스를 참조할 수 없음.
    }
}
    /*
    Tv타입의 참조변수로는 SmartTv 인스턴스 중 TV클래스 멤버들만 사용할 수 있다.
    참조 변수 t로는 text와 caption() 사용은 불가능 하다.
    둘다 같은 타입의 인스턴스지만 참조변수 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
     */
class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
class SmartTv extends Tv {
    String text;    // 캡션(자막)을 보여주기 위한 문자열;

    void caption() {
    }
}

