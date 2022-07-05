package abstract_class_prac;
/*
추상 클래스
1. 클래스를 설계도에 비유한다면 추상 클래스는 미완성 설계도에 비유할 수 있다.
2. 클래스가 미완성이라는 것은 멤버의 개수와 관계 없이 단지, 미완성 메서드(추상 메서드)를 포함하고 있다는 의미이다.
3. 추상클래스는 상속을 통해 자손 클래스에 의해서만 완성될 수 있다.
4. 추상클래스는 추상메서드를 포함하고 있다는 것을 제외하고 일반클래스와 전혀 다르지 않다.
   추상 클래스에도 생성자가 있으며, 멤버변수와 메서드도 가질 수 있다.
추상 메서드
    - 선언부와 구현부로 구성.
    - 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨둔 것이 추상메서드이다.
    - 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다.

 */
abstract public class Player {
    abstract void play(int pos);    // 추상 메서드
    abstract void stop();           // 추상 메서드
}
class AudioPlayer extends Player {

    @Override
    void play(int pos) {        // 추상 메서드 구현

    }

    @Override
    void stop() {               // 추상 메서드 구현

    }
}
abstract class AbstractPlayer extends Player {
    void play(int pos) {        // 추상 메서드 구현

    }
}