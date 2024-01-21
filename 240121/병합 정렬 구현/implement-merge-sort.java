import java.util.Scanner;

public class Main {

	public static int[] merged_arr = new int[100000];
	
	public static void merge_sort(int[] arr, int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			merge_sort(arr,low,mid);
			merge_sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	
	public static void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int k = low;
		
		
		while(i<=mid && j<=high) {
			if(arr[i] <= arr[j]) {
				merged_arr[k] = arr[i];
				k += 1;
				i += 1; 
			}
			else {
				merged_arr[k] = arr[j];
				k += 1;
				j += 1;
			}
		}
		
		if(i>mid) {
			for(int l=j; l<=high; l++) {
				merged_arr[k++] = arr[l]; 
			}
		}
		else {
			for(int l=i; l<=mid; l++) {
				merged_arr[k++] = arr[l];
			}
		}
		for(int l=low; l<=high; l++) {
			arr[l] = merged_arr[l];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		merge_sort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}