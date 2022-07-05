package polymorphism02;
/*
여러 종류의 객체를 배열로 다루기
 */
public class Product {
    int price;
    int bonusPoint;

    Product(){}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price * 10.0);
    }
}
