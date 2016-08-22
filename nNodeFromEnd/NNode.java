package nNodeFromEnd;

import java.util.LinkedList;
import java.util.Scanner;

public class NNode {
	public static LinkedList<Integer> li = new LinkedList<Integer>();
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		li.add(5);
		li.add(3);
		li.add(7);
		li.add(8);
		li.add(0);
		li.add(2);
		li.add(1);
		li.add(3);
		li.add(4);
		System.out.println(""+findNNode());
	}
	
	public static int findNNode(){
		int size=li.size();
		System.out.println("Enter position from last");
		int n=sc.nextInt();
		int res=size-n+1;
		int count=1;
		int result =0;
		for( int i=0; i<li.size();i++){
			if(count==res){
				result = li.get(i);
				break;
			}
			else{
				count++;
			}
		}
		return result;
	}

}
