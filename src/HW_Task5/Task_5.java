/*Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
является ли входная строка логически правильной.
Входная строка логически правильная, если:
1) Открытые скобки должны быть закрыты скобками того же типа.
2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
открытую скобку того же типа.
()[] = true
() = true
{[()]} = true
()() = true
 )()( = false*/

package HW_Task5;
import java.util.*;
public class Task_5 {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean isValid = isValid(s);
        System.out.println(isValid); // true
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((c == ')' && last != '(') || (c == ']' && last != '[') || (c == '}' && last != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
