package polymorphism01;

/*
Buyer에 다형성을 적용하면 아래와 같이 된다.
 */
public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        money -= product.price;
        bonusPoint += (product.price*0.1);
    }

    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv1 tv1 = new Tv1();
        Computer c = new Computer();
        b.buy(tv1);
        b.buy(c);
    }
}
