package labAssignment_3;
import java.util.*;
import java.io.*;
import java.lang.*;
public class SortAlgorithms {

	public static void main(String[] args) {
		//ask the user what type of sort method they want to perform
		int sort;
		
		System.out.println("Please enter the sort type:");
		System.out.println("1.Insertion Sort\n2.Merge Sort\n3.Bubble Sort\n4.Quick Sort");
		Scanner input = new Scanner(System.in);
		sort = input.nextInt();
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
		int upper = 0;
		int lower = 0;
		
		//have case switch for the method the user wants to use
		switch(sort) {
		case 1:
			insertionSort(arr);
			System.out.println("\nThe sorted array: ");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
			break;
		case 2:
			mergeSort(arr, lower, upper);
			System.out.println("\nThe sorted array: ");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
			break;
		case 3:
			bubbleSort(arr);
			System.out.println("\nThe sorted array: ");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
		case 4:
			quickSort(arr, 0, n-1);
			System.out.println("\nThe sorted array: ");
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
			break;
		case 5:
			System.out.println("Goodbye!");
			break;
		}
				
			

	}
	
	static void insertionSort(int arr[]) {
        int length = arr.length, temp, j;
        for (int i = 1; i < length; i++) {
            temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp)
                    arr[j] = arr[j - 1];
                else
                    break;
            }
            arr[j] = temp;
        }

	}
	
	static void mergeSort(int arr[], int lower, int upper) {
        if (lower >= upper)
            return;
        int m = (lower + upper) / 2;
        mergeSort(arr, lower, m);
        mergeSort(arr, m + 1, upper);
        merge(arr, lower, upper);
	}
	
	private static void merge(int arr[], int lower, int upper) {
        int m = (lower + upper) / 2;
        int a[] = new int[m - lower + 1];
        int b[] = new int[upper - m];
        int i, k = 0, k1 = 0, k2 = 0;
        for (i = lower; i <= m; i++, k++)
            a[k] = arr[i];
        k = 0;
        for (; i <= upper; i++, k++)
            b[k] = arr[i];
        for (i = lower; i <= upper && k1 < m - lower + 1 && k2 < upper - m; i++) {
            if (a[k1] < b[k2]) {
                arr[i] = a[k1];
                k1++;
            } else {
                arr[i] = b[k2];
                k2++;
            }
        }
        for (; k1 < m - lower + 1; k1++)
            arr[i++] = a[k1];
        for (; k2 < upper - m; k2++)
            arr[i++] = b[k2];


	}
	
	static void bubbleSort(int arr[]) {
	    int length = arr.length, temp;
	    boolean flag;
	    for (int i = 0; i < length; i++) {
	        flag = false;
	        for (int j = 0; j < length - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	                flag = true;
	            }
	        }
	        if (!flag)
	            break;
	     }

	}
	
	 static void quickSort(int arr[], int lower, int upper) {
	        if (lower >= upper)
	            return;
	        int p = partition(arr, lower, upper);
	        quickSort(arr, lower, p - 1);
	        quickSort(arr, p + 1, upper);
	    }
	    
	    private static int partition(int arr[], int lower, int upper) {
	        int pivot = arr[upper];
	        int j = lower;
	        int temp;
	        for (int i = lower; i <= upper; i++) {
	            if (arr[i] < pivot) {
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                j++;
	            }
	        }
	        temp = arr[upper];
	        arr[upper] = arr[j];
	        arr[j] = temp;

	        return j;

		}
	
	


}
