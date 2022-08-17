package collectionframework;

import java.util.EmptyStackException;
import java.util.Stack;
/*
- 입력한 수식의 괄호가 올바른지 체크!
- '('를 만나면 스택에 넣고,
- ')'를 만나면 스택에서 '('를 꺼낸다.
- ')'를 만나서 '('를 꺼내려할 때, 스택이 비어있거나 수식을 검사하고 난 후에도 스택이 비어있지 않으면 괄호가 잘못된 것!
- ')'를 만나서 '('를 꺼내려할 때 스택이 비어있으면 EmptyStackException이 발생하므로 try-catch문을 이용해 예외처리.
 */

public class Ex11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
            System.out.println("Example:java Ex11_3 \"((2+3))*1)+3\"");
            System.exit(0);
        }

        Stack st = new Stack<>();
        String expression = args[0];

        System.out.println("expression:" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }   // try
    }
}
