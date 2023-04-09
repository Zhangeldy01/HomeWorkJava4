package HW_Task3;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6, 2, 4, 5, 4, 2, 6));

        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i++){
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Палиндром" : "Не палиндром");
    }

}
