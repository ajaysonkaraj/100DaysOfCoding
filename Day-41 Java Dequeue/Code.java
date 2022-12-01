 import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int uniqueNumber = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i < m && !deque.contains(num)) {
                uniqueNumber++;
            } else {
                deque.removeFirst();
                m++;
            }
            deque.add(num);                    
        }
        System.out.println(uniqueNumber);
    }  
}
