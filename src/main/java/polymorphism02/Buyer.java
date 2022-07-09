package polymorphism02;

import java.util.Arrays;

public class Buyer {
    int money = 1000;
    int bonusPoint =0;

    Product[] cart = new Product[10];
    int count = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[count++] = p;
        System.out.println(p + "을 구매하셨습니다.");
        System.out.println("cart: " + Arrays.toString(cart));
    }

        void summary () {    // 구매한 물품에 대한 정보를 요약해서 보여줌.
            int sum = 0;    // 구매한 물품의 가격 합계
            String itemList = "";   // 구입한 물품 목록

            // 반목문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
            for (int i = 0; i < cart.length; i++) {
                if (cart[i] == null) break;
                sum += cart[i].price;
                itemList += cart[i] + ", ";
            }
            System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
            System.out.println("구입하신 제품은 " + itemList + "입니다.");
        }
    }


