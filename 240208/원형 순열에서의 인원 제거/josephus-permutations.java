import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++){ //큐에 1~n 값 넣어주기
            q.add(i);
        }

        while(q.size()!= 1){
            
            for(int i=1; i<=k-1; i++){
            	q.add(q.poll());
            }
            System.out.print(q.poll() + " ");
        }
        System.out.print(q.poll());

        
    }
}