import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static Stack<String> stack = new Stack<>();
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        boolean bool = parent(str);
        
        if(bool) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }

    }
    
    public static boolean parent(String str) {
    	for(int i=0; i<str.length(); i++) {
    		if(str.charAt(i) == '(') {
    			stack.push("(");
    		}
    		else {
    			if(stack.isEmpty()) {
    				return false;
    			}
    			stack.pop();
    		}
    	}
    	
    	if(stack.isEmpty()) {
    		return true;
    	}
    	return false;
    }
}