package objclassquiz;
/*
메서드명 : delChar
기   능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
반환타입 : String
매개변수 : String src - 변환할 문자열
         String target - 제거할 문자들로 구성된 문자열
 */
public class Exercise9_5 {
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)" , "~!@#$%^&*()"));
        System.out.println("(1234\t5)" + " -> " + delChar("(1 2 3 4\t5)"," \t"));
    }

    private static String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer(src.length());

        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);

            // ch가 delCh에 포함되있지 않으면(indexOf()로 못찾으면) sb에 추가
            if(delCh.indexOf(c) == -1) // indexOf(int ch)를 호출
            sb.append(c);
        }
        return sb.toString(); // StringBuffer에 저장된 내용을 String으로 반환
    }
}
