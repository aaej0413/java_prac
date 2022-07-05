package innerclass;
/*
내부 클래서에서 외부 클래스의 변수들에 대한 접근성을 보여주는 예제
 */
public class Ex7_14 {
}
class Outer {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
        // int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            // 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능하다.
            // int liv3 = lv;   -> 에러!! (JDK1.8부터 에러 아님)
            int liv4 = LV;  //Ok
        }
    }
}
