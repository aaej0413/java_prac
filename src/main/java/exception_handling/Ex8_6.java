package exception_handling;

public class Ex8_6 {
    public static void main(String[] args) {

        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;    // 예외를 발생시킴
            // throw new Exception("고의로 발생시켰음.") -> 위의 두즐을 하나로 합친거.

        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 되었음.");
    }
}
