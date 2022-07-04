package variableinitializtion;

public class InitTest {
    int x;
    int y = x; // 인스턴스 변수는 초기화 하지 않아도 사용 가능.

    void method1() {
        int i;
        // int j = i;  에러. 지역변수를 초기화하지 않고 사용
    }
}
