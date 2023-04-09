/* Task_4
Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
и каждый из их узлов содержит одну цифру.
Сложите два числа и верните сумму в виде связанного списка.
}*/

package HW_Task4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class Task_4 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        LinkedList<Integer> ll = new LinkedList<>();
        String str1 = new String();
        String str2 = new String();
        int d1Size = d1.size();
        int d2Size = d2.size();
        for(int i = 0; i <d1Size; i++){
            str1 += d1.pollLast();
        }
        for(int j = 0; j < d2Size; j++){
            str2 += d2.pollLast();
        }
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        while (sum > 0){
            ll.add(sum % 10);
            sum = sum / 10;
        }
        System.out.println(ll);
    }

}
