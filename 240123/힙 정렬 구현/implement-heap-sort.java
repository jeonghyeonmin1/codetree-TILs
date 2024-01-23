import java.util.Scanner;

public class Main {
	public static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = (i) * 2 + 1;
		int r = (i+1)*2;
		
		if((l <= (n)) && (arr[l] > arr[largest])) {
			largest = l;
		}
		
		if((r <= (n)) && (arr[r]) > arr[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}
	
	public static void heap_sort(int[] arr, int n) {
		for(int i=n/2-1; i>=0; i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i-1, 0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		heap_sort(arr, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}