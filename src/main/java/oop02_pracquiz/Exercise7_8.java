package oop02_pracquiz;
class Outer3 {
    int value = 10;

    class Inner {           // InstanceInner
        int value = 20;

        void method1() {
            int value = 30; // LocalInner

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer3.this.value);
        }
    }
}
public class Exercise7_8 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Outer3.Inner ii = outer3.new Inner();

        ii.method1();
    }
}
