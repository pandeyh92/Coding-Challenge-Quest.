package queUsingArr;

import java.util.Scanner;

public class QueueUsingArr {
	public static Scanner sc = new Scanner(System.in);
	public static int arr[];
	public static int head, tail;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Max Size of array!");
		int n=sc.nextInt();
		arr=new int[n];
		int opt=0;
		head=-1;
		tail=-1;
		while(true){
			System.out.println("Choose Operation!");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			opt=sc.nextInt();
			switch(opt){
			case 1:
				enqueue();
				break;
				
			case 2:
				dequeue();
				break;
				
			case 3:
				int[] tmpArr=disp();
				for(int i=0; i<tmpArr.length; i++){
					System.out.println(""+tmpArr[i]);
				}
				break;
			
			case 4: System.exit(1);

			default: System.out.println("Wrong option!");
			}
		}
	}
	public static void enqueue(){
		int data=0;
		if(tail==arr.length-1 && head==0){
			System.out.println("Overflow");
		}
		else if(tail==head-1){
			System.out.println("Overflow");
		}
		else if(head==-1 && tail==-1){
			System.out.println("Enter data");
			data=sc.nextInt();
			head++;
			tail++;
			arr[tail]=data;
		}
		else if(tail==arr.length-1 && head!=0){
			tail=0;
			System.out.println("Enter data");
			data=sc.nextInt();
			arr[tail]=data;
		}
		else{
			tail++;
			System.out.println("Enter data");
			data=sc.nextInt();
			arr[tail]=data;
		}
	}
	public static int dequeue(){
		int tmp=0;
		if(head==tail){
			System.out.println("Underflow!");
		}
		else{
			tmp=arr[head];
			arr[head]=0;
			head++;
		}
		return tmp;
	}
	public static int[] disp(){
		return arr;
	}
}
