package oop02_pracquiz;
/*
익명 클래스 변경 전.
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

public class Exercise7_9 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new EventHandler2());
    }
}

class EventHandler2 extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
