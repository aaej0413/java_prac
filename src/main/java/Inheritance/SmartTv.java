package Inheritance;

public class SmartTv extends Tv{    // SmartTv는 Tv에 자막을 보여주는 기능을 추가.
     boolean caption;

     void displayCaption(String text) {
         if (caption) {       // 자막 상태가 true일 때만 text 보여주기
             System.out.println(text);
         }
     }
}
