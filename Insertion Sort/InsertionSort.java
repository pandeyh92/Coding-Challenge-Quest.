package insertionSort;
import java.util.*;
public class InsertionSort {
	static InsertionSort obj = new InsertionSort();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array to be sorted");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		obj.insertSort(arr, size);
		for(int i=0; i<size; i++){
			System.out.println("The sorted array is: "+arr[i]);
		}
	}
	public void insertSort(int arr[], int size){
		for(int j=1; j<size; j++){
			int key = arr[j];
			int i = j-1;
			while(i>=0 && arr[i]>key){
				arr[i+1]= arr[i];
				i= i-1;
			}
			arr[i+1]= key;
		}
	}
}
