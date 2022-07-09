package objclassquiz;
/*
메서드명 : contains
기   능 : 첫 번째 문자열(src)에 두번째 문자열(target)이 포함되어 있는지 확인한다.
         포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
반환타입 : boolean
매개변수 : String src, String target
 */
public class Exerrcise9_4 {
    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
        System.out.println(contains2("12345", "23"));
        System.out.println(contains2("12345", "67"));

    }

    static boolean contains(String src, String target) {

        if (src.contains(target)) {
            return true;
        }else {
            return false;
        }
    }

    static boolean contains2(String src, String target) {
        if(src.indexOf(target,0) == -1) {   // indexOf 메서드는 찾으려는 문자열이 없을 경우 -1을 반환.
            return false;
        }else {
            return true;
        }
    }
}
