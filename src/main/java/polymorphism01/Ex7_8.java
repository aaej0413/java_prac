package polymorphism01;

import java.util.Arrays;

class Product2 {
    int price;  // 제품의 가격
    int bonusPoint; // 제품 구매시 제공하는 보너스 점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
    }
}
class Tv2 extends Product2 {
    Tv2() {
        // 조상 클래스의 생성자 Product2(int price)를 호출.
        super(100);     // TV2의 가격을 100만원으로 설정.
    }

    public String toString() {
        return "Tv";
    }
}
class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }
    public String toString() {

        return "Computer2";
    }
}
class Buyer3 {
    int money = 1000;   // 고객이 가진 돈.
    int bonusPoint = 0; // 고객의 보너스 점수.
    Product2[] cart = new Product2[10];  // 구입한 제품을 저장하기 위한 배열(카트)
    int i = 0;

    void buy(Product2 product2) {
        if (money < product2.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= product2.price;
        bonusPoint += product2.bonusPoint;
        cart[i++] = product2;
        System.out.println(product2 + "을/를 구입하셨습니다.");      // product2 == product2.toString() ->
                                                                // 참조변수와 String을 결합할 때,
                                                                // product2.toString()으로 변환돼서 반환.
        System.out.println("cart:" + Arrays.toString(cart));
    }
}
    public class Ex7_8 {
        public static void main(String[] args) {
            Buyer3 b = new Buyer3();

            b.buy(new Tv2());
            b.buy(new Computer2());

            System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
            System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
        }


    }

