package stackUsingArr;
import java.util.Scanner;
public class StackUsingArr {
	public int top=-1;
	public static int arr[];
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArr obj = new StackUsingArr();
		int opt=0;
		System.out.println("Enter Max-length of array");
		int len=sc.nextInt();
		arr = new int[len];
		while(true){
			System.out.println("Choose Operation:");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			opt=sc.nextInt();
			switch(opt){
			case 1:
				obj.push(arr);
				break;
			
			case 2:
				obj.pop(arr);
				break;
				
			case 3:
				int y=obj.peek(arr);
				System.out.println(""+y);
				break;
				
			case 4:
				int tmp[]=obj.disp(arr);
				for(int i =0;i<tmp.length;i++){
					System.out.println(""+tmp[i]);
				}
				break;
				
			case 5:
				System.exit(1);
				
			default :
				System.out.println("Wrong option!");
			}
		}
	}
	public void push(int arr[]){
		if(top==arr.length-1){
			System.err.println("Overflow");
		}
		else{
			System.out.println("Enter data to be pushed");
			int data=sc.nextInt();
			top++;
			arr[top]=data;
		}
	}
	public int peek(int arr[]){
		return arr[top];
	}
	public int pop(int arr[]){
		int x=0;
		if(top==-1){
			System.err.println("Underflow");
		}
		else {
			x=arr[top];
			arr[top]=0;
			top--;
		}
		return x;	
	}
	public int[] disp(int arr[]){
		if(top==-1){
			System.err.println("Underflow");
			return null;
		}
		else{
			return arr;
		}
	}
}
