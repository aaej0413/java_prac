package Inheritance;

public class Tv {
    boolean power;  // 기본값 false
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
