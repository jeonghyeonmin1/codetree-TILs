import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end){
        if(start >= end)
            return;

        int pivot = start;
        int lo = start + 1;
        int hi = end;

        while(lo <= hi){
            while(lo <= end && arr[lo] <= arr[pivot])
                lo++;
            
            while(hi > start && arr[hi] >= arr[pivot])
                hi--;
            
            if(lo > hi)
                swap(arr, hi, pivot);
            
            else
                swap(arr,lo,hi);
        }

        quickSort(arr,start, hi-1);
        quickSort(arr, hi + 1, end);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}