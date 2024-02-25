import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        Deque<Integer> dq = new ArrayDeque<>();

        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            dq.addLast(i);
        }

        while(dq.size()>1){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.print(dq.peekFirst());
    }
}