package abstract_class_prac;
/*
추상 클래스
    - 상속이 자손클래스를 만드는데 조상클래스를 사용하는 것이라면,
      추상화는 기존의 클래스의 공통부분을 뽑아내서 조상 클래스를 만드는 것이라고 할 수 있다.
    - 상속 계층을 따라 내려갈수록 클래스는 기능이 점점 추가되어 구체화 정도가 심해지며,
      상송 계층을 따라 올라갈수록 클래스는 추상화의 정도가 심해진다고 할 수 있다.
 */
public class before_abstract {
}
class Marine {  // 보병
    int x, y;   // 현재 위치
    void move(int x, int y) {/* 지정된 위치로 이동 */}
    void stop()             {/* 현재 위치에 정지 */}
    void stimPack()         {/* 스팀팩을 사용한다. */}
}

class Tank {    // 탱크
    int x, y;    // 현재 위치
    void move(int x, int y) {/* 지정된 위치로 이동 */}
    void stop()             {/* 현재 위치에 정지 */}
    void chaneMode()        {/* 공격모드를 변환한다. */}
}

class Dropship {    // 송수선
    int x, y;    // 현재 위치
    void move(int x, int y) {/* 지정된 위치로 이동 */}
    void stop()             {/* 현재 위치에 정지 */}
    void load()             {/* 선택된 대상을 태운다. */}
    void unload()           {/* 선택된 대상을 내린다. */}
}

