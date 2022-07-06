package oop02_pracquiz;
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return; // return 0
        prevChannel = this.channel;
        this.channel = channel;;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        myTv.setChannel(10);
        System.out.println("CH: " + myTv.getChannel());
        myTv.setVolume(20);
        System.out.println("VOLUME: " + myTv.getVolume());
    }
}
