package innerclass;
/*
내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때 변수 앞에 'this' 또는 '외부클래스명.this'를 붙여서 구별.
 */
class Outer3 {
    int value = 10;     // Outer3.this.value

    class Inner {
        int value = 20;    // this.value

        void method1() {
            int value = 30;
            System.out.println("            value : " + value);
            System.out.println("       this.value : " + this.value);
            System.out.println("Outer3.this.value : " + Outer3.this.value);
        }
    }   // Inner 클래스의 끝
}       // Outer3 클래스의 끝
public class Ex7_16 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }
}
