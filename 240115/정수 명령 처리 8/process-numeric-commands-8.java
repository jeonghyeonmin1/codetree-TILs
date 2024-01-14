import java.util.Scanner;
import java.util.LinkedList;
public class Main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> I = new LinkedList<>();
        
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            String[] str = sc.nextLine().split(" ");

            if(str[0].equals("push_front")){
                I.addFirst(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("push_back")){
                I.addLast(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("pop_front")){
                System.out.println(I.pollFirst());
            }
            else if(str[0].equals("pop_back")){
                System.out.println(I.pollLast());
            }
            else if(str[0].equals("size")){
                System.out.println(I.size());
            }
            else if(str[0].equals("empty")){
                if(I.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(str[0].equals("front")){
                System.out.println(I.peekFirst());
            }
            else if(str[0].equals("back")){
                System.out.println(I.peekLast());
            }

        }
    }
}