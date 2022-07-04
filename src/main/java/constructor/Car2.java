package constructor;

public class Car2 {
    String color;       // 색상
    String gertType;    // 변속기 종류
    int door;           // 문의 개수

    Car2() {
        this("white", "auto", 4);  // 맨 밑에 생성자를 불러온거. 다른 생성자 불러올 땐 this 사용.
        // 나중에 기본생성자로 생성하면 밑에 값이 기본으로 초기화됨.
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gertType,int door) {
        this.color = color;
        this.gertType = gertType;
        this.door = door;
    }
}
