package oop01_pracquiz;

public class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
    }
}
