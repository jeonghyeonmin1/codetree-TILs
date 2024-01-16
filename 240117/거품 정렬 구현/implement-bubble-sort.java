import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();

        String[] str = sc.nextLine().split(" ");

        int[] num2 = new int[str.length];


        for(int i=0; i<str.length; i++){
            int num3 = Integer.parseInt(str[i]);
            num2[i] = num3;
        }
       

        for(int i=0; i<num2.length; i++){
            for(int j=0; j<num2.length-1-i; j++){
                if(num2[j] > num2[j+1]){
                    int tmp = num2[j];
                    num2[j] = num2[j+1];
                    num2[j+1] = tmp;
                }
            }
        }

        for(int i=0; i<num2.length; i++){
            System.out.print(num2[i]+" ");
        }
   }
}