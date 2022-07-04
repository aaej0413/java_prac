package polymorphism;

public class Buyer {
    int money = 1000;   // 고객, 물건을 사는 사람이 가진 돈
    int bosusPoint = 0;     // 보너스 점수

    void buy(Tv1 tv1) {
        // Buyer가 가진 돈(money)에서 제품의 가격(tv.price)만큼 뺀다.
        money -= tv1.price;

        // Buyer의 보너스점수(bonusPoint)에 제품의 보너스 점수(tv1.bonusPoint)를 더한다.
        bosusPoint += tv1.bonusPoint;
    }

    void buy(Computer computer) {
        money -= computer.price;
        bosusPoint += computer.bonusPoint;      // 이런식으로 하면 제품이 생길 때 마다 buy함수를 만들어 줘야함.
    }
}
