package oop02_pracquiz;
/*
1. 메서드명 : shuffle
   기   능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.
   반환타입 : 없음
   매개변수 : 없음
   -----------------------------------------------------------
2. 메서드명 : pick
   기   능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
   반환타입 : SutdaCard
   매개변수 : int index - 위치
   -----------------------------------------------------------
3. 메서드명 : pick
   기   능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
   반환타입 : SutdCard
   매개변수 : 없음
 */
class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard[] cards2 = new SutdaCard[CARD_NUM];
    SutdaDeck2() {
        for(int i=0;i < cards2.length;i++) {
            int num = i%10+1;
            boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
            cards2[i] = new SutdaCard(num,isKwang);
        }
    }
    public void shuffle() {
        for (int i = 0; i < cards2.length; i++) {
            int j = (int) (Math.random()*cards2.length);

            SutdaCard tmp = cards2[i];
            cards2[i] = cards2[j];
            cards2[j] = tmp;
        }
    }

    public SutdaCard2 pick(int index) {
        if (index < 0 || index >= CARD_NUM) {
            return null;
        }
        return cards2[index];
    }

    public SutdaCard2 pick() {
        int index = (int) (Math.random()*cards2.length);
        return pick(index);
    }

}
class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num+(isKwang == true ? "K" : "");
    }
}
public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards2.length; i++) {
            System.out.print(deck.cards2[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
