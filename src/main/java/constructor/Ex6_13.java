package constructor;

public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", geerType = " + c1.gertType + ", door = " + c1.door);
        System.out.println("c1의 color = " + c2.color + ", geerType = " + c2.gertType + ", door = " + c2.door);

    }
}
