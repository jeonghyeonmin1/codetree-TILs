import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str = sc.next();
            if(str.equals("push")){
                int num = sc.nextInt();
                q.add(num);
            }
            else if(str.equals("pop")){
                System.out.println(q.poll());
            }
            else if(str.equals("size")){
                System.out.println(q.size());
            }
            else if(str.equals("empty")){
                if(q.isEmpty()){
                    System.out.println(1);
                }   
                else{
                    System.out.println(0);
                } 
            }
            else if(str.equals("front")){
                System.out.println(q.peek());
            }
        }
    }
}