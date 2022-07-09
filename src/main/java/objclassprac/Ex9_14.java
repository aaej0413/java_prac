package objclassprac;
/*
래퍼(wrapper)클래스 예제
 */
public class Ex9_14 {
    public static void main(String[] args) {

        Integer i = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println("i==i2 ? " + (i==i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));     // 값이 같으면 0을 리턴.
        System.out.println("i.toString() = " + i.toString());

        System.out.println("--------------------------------------------");

        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + " bits");
        System.out.println("BYTES = " + Integer.BYTES + "bytes");
        System.out.println("TYPE = " + Integer.TYPE);

        int i4 = Integer.parseInt("100",2);
        int i5 = Integer.parseInt("100", 8);
        int i6 = Integer.parseInt("100", 16);
        int i7 = Integer.parseInt("FF", 16);
    //  int i8 = Intege.pareseInt("FF");    // NumberFormatException발생

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
    }
}
