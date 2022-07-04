package constructor;

public class Car {
    String color;       // 색상
    String gertType;    // 변속기 종류
    int door;           // 문의 개수

    Car() {}    // 기본 생성자
    Car(String c, String g, int d) { // 생성자의 매개변수로 인스턴스 변수들을 초기화.
        this.color = c;  // color는 인스턴스 변수, c는 지역변수
        this.gertType = g;  // this는 참조변수로 인스턴스 자신을 가리킴.
        this.door = d;
    }
}
