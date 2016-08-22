package multisum;

import java.util.ArrayList;

public class MultiSum {
	
	public static ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,1,4,20,3,10,5,8,9,10};
		int target=8;
		ArrayList<ArrayList<Integer>> arrRes=findSum(arr, target);
		for(int i=0; i<arrRes.size();i++){
			System.out.println(""+arrRes.get(i));
		}
	}
	public static ArrayList<ArrayList<Integer>> findSum(int arr[],int target){
		for(int i=0; i<arr.length-1;i++){
			int x=arr[i];
			if(x==target){
				ArrayList<Integer>inner = new ArrayList<Integer>();
				inner.add(x);
				outer.add(inner);				
			}
			else {
				for(int j=1;j<arr.length;j++){
					if(x>target){
						break;
					}
					else{
						if(x==target){
							break;
						}
						else {
							ArrayList<Integer>inner = new ArrayList<Integer>();
							inner.add(x);
							inner.add(arr[j]);
							x=x+arr[j];
							outer.add(inner);
							continue;
						}
					}
				}
			}	
		}
		return outer;
	}
}