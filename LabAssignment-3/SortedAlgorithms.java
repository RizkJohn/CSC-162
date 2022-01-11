package labAssignment_3;
import java.util.*;
public class SortedAlgorithms {
	public static void main(String[] args) {
	       int arr[] = new int[20];
	      
	       //Create array
	       arr[0] = (-10);
	       arr[1] = (5);
	       arr[2] = (-1);
	       arr[3] = (-15);
	       arr[4] = (-12);
	       arr[5] = (-5);
	       arr[6] = (7);
	       arr[7] = (17);
	       arr[8] = (-2);
	       arr[9] = (-19);
	       arr[10] = (-6);
	       arr[11] = (8);
	       arr[12] = (10);
	       arr[13] = (2);
	       arr[14] = (-3);
	       arr[15] = (19);
	       arr[16] = (6);
	       arr[17] = (-7);
	       arr[18] = (14);
	       arr[19] = (0);
	      
	       System.out.println("Quick Sort");
	       //test each sorting algorithms
	       SortedAlgorithms sortAlgs = new SortedAlgorithms();
	      
	       System.out.println("Swap count: " + sortAlgs.quickSort(arr, 0, 19));
	       for(int i : arr)
	           System.out.print(i + " ");
	}
	
	 // Method gets array and sorts it with insertion sort
	   // Method returns total number of swaps
	   public int insertionSort(int arr[]) {
	       int swapCount = 0;
	       for(int i = 1; i < arr.length; i++) {
	           int j = i;
	           while(j >= 1 && arr[j] < arr[j-1]) {
	               int c = arr[j];
	               arr[j] = arr[j-1];
	               arr[j-1] = c;
	               j--;
	               swapCount++;
	           }
	       }
	       return swapCount;
	   }
	  
	   // Method gets array and sorts it with bubble sort
	   // Method returns total number of swaps
	   public int bubbleSort(int arr[]) {
	       int swapCount = 0;
	       int currentCount = 0;
	       while(true) {
	           currentCount = 0;
	           for(int i = 1; i < arr.length; i++) {
	               if(arr[i-1] > arr[i]) {
	                   int c = arr[i];
	                   arr[i] = arr[i-1];
	                   arr[i-1] = c;
	                   currentCount++;
	               }
	           }
	          
	           if(currentCount == 0)
	               break;
	           swapCount += currentCount;
	       }
	       return swapCount;
	   }
	  
	   // Method gets array and sorts it with merge sort
	   // Method returns total number of swaps
	   public int mergeSort(int arr[]) {
	       if(arr.length < 2) {
	           return 0;
	       }
	      
	       int leftArr[] = new int[arr.length/2];
	       int rightArr[] = new int[arr.length-leftArr.length];
	      
	       for(int i = 0; i < arr.length/2; i++)
	           leftArr[i] = arr[i];
	       for(int i = arr.length/2; i < arr.length; i++)
	           rightArr[i - arr.length/2] = arr[i];
	      
	       int swapCount = mergeSort(leftArr) + mergeSort(rightArr);
	       int leftK = 0;
	       int rightK = 0;
	       for(int i = 0; i < arr.length; i++) {
	           if(leftK >= leftArr.length) {
	               arr[i] = (rightArr[rightK]);
	               rightK++;
	               continue;
	           }
	           if(rightK >= rightArr.length) {
	               arr[i] = (leftArr[leftK]);
	               leftK++;
	               continue;
	           }
	           if(leftArr[leftK] <= rightArr[rightK]) {
	               arr[i] = (leftArr[leftK]);
	               leftK++;
	               continue;
	           } else {
	               arr[i] = (rightArr[rightK]);
	               rightK++;
	               swapCount++;
	               continue;
	           }
	       }
	      
	       return swapCount;
	   }
	  
	   // Method gets array and margins in which it is being sorted with quick sort algorithm
	   // Method returns total number of swaps
	   public int quickSort(int arr[], int L, int R) {
	       if(L >= R)
	           return 0;
	      
	       int swapCount = 0;
	       int mid;
	       int pivot = arr[R];
	       int index = L-1;
	   for (int j = L; j <= R - 1; j++)
	   {
	   if (arr[j] <= pivot)
	   {
	       swapCount++;
	   index++;
	   int c = arr[index];
	   arr[index] = arr[j];
	   arr[j] = c;
	   }
	   }
	   int c = arr[index+1];
	arr[index+1] = arr[R];
	arr[R] = c;
	   mid = index+1;
	      
	       swapCount += quickSort(arr, 0, mid-1) + quickSort(arr, mid+1, R);
	      
	       return swapCount;
	   }
	  
}

