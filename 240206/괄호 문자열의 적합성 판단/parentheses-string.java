import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push("(");
            }
            else if(str.charAt(i) == ')'){
                if(!stack.peek().equals("(")){
                    break;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }


    }
}