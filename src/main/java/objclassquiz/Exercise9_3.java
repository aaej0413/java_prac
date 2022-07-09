package objclassquiz;
/*
메서드명 : count
기   능 : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환한다.
반환타입 : int
매개변수 : String src, String target
 */
public class Exercise9_3 {
    public static void main(String[] args) {

        System.out.println(count("12345AB12AB345AB" ,"AB"));
        System.out.println(count("12345","AB"));
    }
    // apple 에서 app를 찾으려면??
    public static int count(String src, String target) {

        int count = 0;  // 찾은 횟수
        int pos = 0;


        // 1. src에서 pos의 위치부터 찾는다.
        // 2. 찾으면 count의 값을 1 증가시키고, pos의 값을 target.length만큼 증가시킨다.
        // 3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
        while((pos = src.indexOf(target,pos))!=-1) {
            count++;
            pos += target.length();
        }
        return count;
    }
}
