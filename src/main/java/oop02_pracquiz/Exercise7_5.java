package oop02_pracquiz;
/*
-- 메서드 추가 --
메서드명 : gotoPrevChannel
기   능 : 현재 채널을 이전 채널로 변경.
반환타입 : 없음
매개변수 : 없음
 */

public class Exercise7_5 {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        myTv.setChannel(10);
        System.out.println("CH: " + myTv.getChannel());
        myTv.setChannel(20);
        System.out.println("CH: " + myTv.getChannel());
        myTv.gotoPrevChannel();
        System.out.println("CH: " + myTv.getChannel());
    }
}
