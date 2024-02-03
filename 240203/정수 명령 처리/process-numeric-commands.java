import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String str = sc.next();

            if(str.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            }
            else if(str.equals("pop")){
                System.out.println(stack.pop());
            }
            else if(str.equals("size")){
                System.out.println(stack.size());
            }
            else if(str.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(str.equals("empty")){
                System.out.println(stack.peek());
            }
        }

        }
}