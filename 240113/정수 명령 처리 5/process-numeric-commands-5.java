import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int num = sc.nextInt();

        for(int i=0; i<=num; i++){
            String[] str = sc.nextLine().split(" ");
            if (str[0].equals("push_back")){
                int num1 = Integer.parseInt(str[1]);
                arr.add(num1);
            }
            else if(str[0].equals("pop_back")){
                arr.remove(arr.size()-1);
            }
            else if(str[0].equals("size")){
                System.out.println(arr.size());
            }
            else if(str[0].equals("get")){
                int num1 = Integer.parseInt(str[1]);
                System.out.println(arr.get(num1-1));
            }

        }
    }
}