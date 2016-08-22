package Locks;
import java.util.*;

public class Lockimp {

	
	static Lockimp obj = new Lockimp();
	public static void main(String[] args)
	{
	 int n=0;
	 System.out.println("Enter limit of lock");
	 Scanner in = new Scanner(System.in);
	  n = in.nextInt();
	 System.out.println("limit of lock is:"+n);
	 
	 int locktarget[] = new int [n];
	 int initlock[] = new int [n];
	 int result[] = new int  [n];
	 
	 System.out.println("Enter target of the lock");
	 for(int i =0; i< locktarget.length; i++){
		locktarget[i] =  in.nextInt();
	 }
	 
	 System.out.println("Enter initial combination of the lock");
	 for(int j =0; j< initlock.length; j++){
		initlock[j] =  in.nextInt();
	 }
	 obj.lockanswer(locktarget, initlock, result);
	 
	}
	public void lockanswer(int locktarget[], int initlock[], int result[]){
		for(int k =0; k< result.length; k++){
			result[k] = (locktarget[k] - initlock[k]);
		}
		System.out.println("The steps are:");
		for(int k=0 ; k< result.length; k++){
			if(result[k]<0){
				result[k]= - result[k];
				if(result[k]>5){
					System.out.println("down"+(10-result[k]));
				}
				else {
					System.out.println("up"+result[k]);	
				}
				
			}
			else if(result[k]>0){
				if(result[k]>5){
					System.out.println("down"+ (10-result[k]));
				}
				else {
					System.out.println("up"+result[k]);	
				}
				
			}
			else{
				System.out.println("- Stay");
			}
			//System.out.println("the steps are" +result[k]);
			
			
			
		}
		
	}
	
}




