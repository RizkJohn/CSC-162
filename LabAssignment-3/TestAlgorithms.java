package labAssignment_3;
import java.util.*;
public class TestAlgorithms {
	public static void main(String[] args) {
	       System.out.println("LOG :: Check Code");
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
	      
	       System.out.println("LOG :: Start sorting");
	       //test each sorting algorithms
	       SortedAlgorithms sortAlgs = new SortedAlgorithms();
	      
	       System.out.println("Swap count: " + sortAlgs.quickSort(arr, 0, 19));
	       for(int i : arr)
	           System.out.print(i + " ");
	}

}
