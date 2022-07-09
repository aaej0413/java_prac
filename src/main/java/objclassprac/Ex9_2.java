package objclassprac;
/*
equals()메서드 오버라이딩
 */
class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;  // obj가 Object 타입이므로 id값을 참조하기 위해서는 Person타입으로
        }else {                             // 형변환이 필요하다
            return false;       // 타입이 Person이 아니면 값을 비교할 필요도 없다.
        }
    }
}
public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222222L);
        Person p2 = new Person(8011081111222222L);

        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다.");
        }else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}
