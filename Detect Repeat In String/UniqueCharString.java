package crackTheInterview;

import java.util.Scanner;

public class UniqueCharString {
	String words = null;

	public static void main(String[] args) {
		UniqueCharString obj = new UniqueCharString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		obj.words = sc.next();
		String wordarr []= new String [obj.words.length()];
		wordarr=obj.words.split("");
		for(int i=0; i<wordarr.length-1;i++){
			String temp=wordarr[i];
			for(int j=i+1; j<wordarr.length;j++){
				if (temp.equals(wordarr[j])){
					System.out.println("Match found");
					System.out.println("Location: "+(j+1));
				}
			}
		}	
	}
}