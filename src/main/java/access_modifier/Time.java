package access_modifier;

/*
캡슐화와 접근 제어자 - 클래스나 멤버, 주로 멤버에 접근제어자를 사용하는 이유는??
    1. 클래스 내부에 선언된 데이터를 보호하기 위해.
    2. 데이터가 유효한 값을 유지하도록.
    3. 비밀번호와 같은 중요한 데이터를 외부에서 함부로 변경하지 못하도록 하기 위해.
    이것을 데이터 감추기(data hiding)라고 하며, 객체지향개념의 캡슐화(encapsulation)에 해당하는 내용이다.
 */
public class Time {
    private int hour;
    private int minute;     // 접근 제어자를 private으로 하여 외부에서 직접 접근하지 못하도록 한다.
    private int second;

    public int getHour() {      // get으로 시작하는 메서드는 단순히 멤버변수의 값을 반환하는 일을 함.
        return hour;
    }

    public void setHour(int hour) {     // set으로 시작하는 메서드는 매게변수에 지정된 값을 검사하여 조건에 맞는 값일 때만 멤버 변슈의 값을 변경.
        if(hour < 0 || hour > 23) return;
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }
}
