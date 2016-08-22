package Stacks;
import java.util.*;

public class StackImplement {
	
	public int num=0;
	public int top=0;
	public int ph = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=0;
		StackImplement o = new StackImplement();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		o.num = in.nextInt();
		o.ph = o.num;
		
		
		int stackarr[] = new int[o.num];
		while(true)
		{
			System.out.println("The size is: "+o.num );
			System.out.println("\nChoose Action:");
			System.out.println("1: PUSH");
			System.out.println("2: POP");
			System.out.println("3: DISPLAY");
			System.out.println("4: EXIT");

			int temp=0;
			temp=in.nextInt();

			switch(temp) 
			{
			case 1:
				o.push(stackarr);
				break;
			case 2:
				o.pop(stackarr);
				break;
			case 3:
				o.disp(stackarr);
				break;
			case 4:
				o.exit();
				break;
			default:
				break;
			}
		}

		
	}
	
	public  void push(int stackarr[])
	{	
		if(top==num)
		{
			System.out.println("The stack is full-overflow error");
		}
		else
		{
			int insrt;
			System.out.println("Enter element to be inserted");
			Scanner inp = new Scanner(System.in);
			insrt = inp.nextInt();
			stackarr[top]=insrt;
			top++;	
		}
		
	}
		
	public void pop(int stackarr[])
	{
		if(top==0)
		{
			System.out.println("The stack is empty-underflow error");
		}
		else
		{
			int elem = stackarr[top-1];
			top--;
			System.out.println("The deleted element is: "+elem);
		}
	}
	
	public void disp(int stackarr[])
	{
		if(top==0)
		{
			System.out.println("The stack is empty-underflow error");
		}
		System.out.println("The elements of the stack are:");
		for(int i=0; i<top; i++)
		{
			System.out.println(" "+stackarr[i]);
		}
	}
	
	public void exit()
	{
		System.exit(0);
	}

}
