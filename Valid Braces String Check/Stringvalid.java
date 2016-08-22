package hackerRank;
import java.util.*;

public class Stringvalid {
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String brack = sc.nextLine();
		char arr[] = new char[brack.length()];
		for(int i=0; i<brack.length();i++){
			arr[i]=brack.charAt(i);
			if(arr[i]==')'){
				System.out.println("Invalid");
				System.exit(0);
			}
			if(arr[i]==']'){
				System.out.println("Invalid");
				System.exit(0);
			}
			if(arr[i]=='}'){
				System.out.println("Invalid");
				System.exit(0);
			}
		}	
		for(int j=0; j<brack.length();j++){
			if(arr[j]=='('){
				for(int k = j+1; k<brack.length();k++){
					if(arr[k]!=')'){
						System.out.println("Invalid");
						System.exit(0);
					}
				}
			}
			if(arr[j]=='['){
				for(int k = j+1; k<brack.length();k++){
					if(arr[k]!=']'){
						System.out.println("Invalid");
						System.exit(0);
					}
				}
			}
			if(arr[j]=='{'){
				for(int k = j+1; k<brack.length();k++){
					if(arr[k]!='}'){
						System.out.println("Invalid");
						System.exit(0);
					}
				}
			}
		}
		
		
	}
}
