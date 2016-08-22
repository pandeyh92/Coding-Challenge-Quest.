package twosum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Two_Sum {
	public static Map<Integer, Integer>hm = new HashMap<Integer,Integer>();
	public static Map<Integer, Integer>hm2 = new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,79,0,56,3,33,2,11,3,7,10,15,5,6, 8,1};
		int target =9;
		ArrayList<ArrayList<Integer>> arr=sumFind(nums,target);
		for(int i=0; i<arr.size();i++){
			System.out.println(""+arr.get(i));
		}
		ArrayList<ArrayList<Integer>> arr2=anySum(nums,target);
		for(int i=0; i<arr2.size();i++){
			System.out.println(""+arr2.get(i));
		}
		
	}
	public static ArrayList<ArrayList<Integer>> sumFind(int[] nums, int target){
		ArrayList<ArrayList<Integer>> resultArray=new ArrayList<>();
		int tmp=0;
		for(int i=0; i<nums.length;i++){
			hm.put(nums[i], i);
		}
		for(int i=0; i<nums.length-1;i++){
			tmp = target-nums[i];
			if(hm.containsKey(tmp)){
				ArrayList<Integer> res=new ArrayList<Integer>();
				res.add(i);
				res.add(hm.get(tmp));
				resultArray.add(res);
			}
		}
		return resultArray;
	}
	public static ArrayList<ArrayList<Integer>> anySum(int[] nums, int target){
		int tmp=0;
		ArrayList<ArrayList<Integer>> resultArray2=new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++){
			al.add(nums[i]);
		}
		
		for(int i=0;i<al.size()-1;i++){
			for(int j=1; j<al.size(); j++){
				tmp=al.get(i);
				if(tmp+al.get(j)==target){
					ArrayList<Integer> res2=new ArrayList<Integer>();
					res2.add(al.get(i));
					res2.add(al.get(j));
					resultArray2.add(res2);
				}
			}
		}
		return resultArray2;
	}
}
