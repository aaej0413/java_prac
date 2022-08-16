package polymorphism01;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe; 에서 조상인 Car 타입이므로 형변환이 생략됨.
//      car.water()  - 컴파일 에러!!! Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine) car;     // 자손타입으로 형변환이므로 형변환 생략 불가.
        fe2.water();
        }
    }

    class Car {
        String color;
        int door;

        void drive() {  // 운전하는 기능
            System.out.println("drive, Brrrr~");
        }
        void stop() {   // 멈추는 기능
            System.out.println("stop!!!");
        }
    }
    class FireEngine extends Car{
        void water() {  // 물을 뿌리는 기능
            System.out.println("water!!!");
        }
    }
