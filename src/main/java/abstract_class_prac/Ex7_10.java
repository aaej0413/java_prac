package abstract_class_prac;
/*
공통조상인 Unit클래스 타입의 객체 배열을 통해 서로 다른 종류ㅓ의 인스턴스를 하나의 묶음으로 다룰 수 있다는 것을
보여주기 위한 것
 */
public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine2(), new Tank2(), new Dropship2()};

        for(int i = 0; i < group.length; i++) {
            group[i].move(100,200);
        }
    }
}

class Marine2 extends Unit {


    @Override
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() {}
}

class Tank2 extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() {}
}

class Dropship2 extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load() {}
    void unload() {}
}