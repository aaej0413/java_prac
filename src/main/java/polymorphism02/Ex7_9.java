package polymorphism02;

public class Ex7_9 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        buyer.summary();
    }
}
