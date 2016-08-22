package hackerRank;
import java.util.*;

public class Trinagleinp {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		n = sc.nextInt();
		int arr [][] = new int [n][3]; 
		for(int i =0; i<n; i++){
			arr[i][0]=sc.nextInt();
			if(0>arr[i][0] || arr[i][0]>5000){
				System.out.println("Invalid");
			}
			arr[i][1]=sc.nextInt();
			if(0>arr[i][1] || arr[i][1]>5000){
				System.out.println("Invalid");
			}
			arr[i][2]=sc.nextInt();
			if(0>arr[i][2] || arr[i][2]>5000){
				System.out.println("Invalid");
				System.exit(0);
			}
			
		}
		
		for(int j =0; j<n; j++){
			if((arr[j][0]==arr[j][1]) && (arr[j][0]==arr[j][2]) &&  (arr[j][1]==arr[j][2])){
				System.out.println("Equilateral");
			}
				else if((arr[j][0]==arr[j][1]) || (arr[j][0]==arr[j][2]) ||  (arr[j][1]==arr[j][2])){
					System.out.println("Isosceles");
				}
				
				else {
					System.out.println("Nothing");
			}
			
			
		}

	}

}
