package twoStackArr;

import java.util.Scanner;

public class TwoStkOneArr {
	public static Scanner sc= new Scanner(System.in);
	public static int arr[];
	public static int top1=-1;
	public static int top2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		arr=new int[size];
		top2=size;
		while(true){
			System.out.println("Choose Operation");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			int opt=sc.nextInt();
			switch(opt){
			case 1:
				push(arr);
				break;
			
			case 2:
				pop(arr);
				break;
				
			case 3:
				peek(arr);
				break;
				
			case 4:
				int tmparr[]=display(arr);
				for(int i=0;i<tmparr.length;i++){
					System.out.print(""+tmparr[i]);
				}
				break;
				
			case 5:
				System.exit(1);
				
			default :
				System.out.println("Wrong option!");
			}
		}
	}
	public static void push(int arr[]){
		System.out.println("Push to Stack 1 or Stack 2 ?");
		int opt2=sc.nextInt();
		if((opt2==1 && top2==0)||(opt2==2 && top1==arr.length-1)){
			System.out.println("Overflow");
		}
		else if((opt2==1 && top2==top1+1)||(opt2==2 && top2==top1+1)){
			System.out.println("Overflow");
		}
		else if(opt2==1){
			System.out.println("Enter data to be pushed");
			int data=sc.nextInt();
			top1++;
			arr[top1]=data;
		}
		else if(opt2==2) {
			System.out.println("Enter data to be pushed");
			int data=sc.nextInt();
			top2--;
			arr[top2]=data;
		}
	}
	public static int pop(int arr[]){
		System.out.println("Pop from Stack 1 or Stack 2 ?");
		int opt2=sc.nextInt();
		if(opt2==1 && top1==-1){
			System.out.println("Underflow");
			return -1;
		}
		else if(opt2==2 && top2==arr.length){
			System.out.println("Underflow");
			return -1;
		}
		else if(opt2==1){
			int x=arr[top1];
			arr[top1]=0;
			top1--;
			return x;
		}
		else {
			int x=arr[top2];
			arr[top2]=0;
			top2++;
			return x;
		}
	}
	public static int peek(int arr[]){
		System.out.println("Peek from Stack 1 or Stack 2 ?");
		int opt3=sc.nextInt();
		if(opt3==1){
			return arr[top1];
		}
		else {
			return arr[top2];
		}
	}
	public static int[] display(int arr[]){
		return arr;
	}

}
