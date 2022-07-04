package constructor;

public class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gertType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 5);

        System.out.println("c1의 color = " + c1.color + "geerType = " + c1.gertType + "door = " + c1.door);
        System.out.println("c1의 color = " + c2.color + "geerType = " + c2.gertType + "door = " + c2.door);

    }
}
