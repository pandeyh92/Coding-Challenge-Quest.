package palindrUsingStacks;

import java.util.Stack;

public class PalindromeUsingStacks {
	public static Stack<Character> st = new Stack<Character>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcxcba";
		chkPalindrome(str);
	}
	public static void chkPalindrome(String str){
		char arr[]=str.toCharArray();
		int i=0;
		while(arr[i]!='x'){
			st.push(arr[i]);
			i++;
		}
		i++;
		while(i<arr.length){
			if(st.peek()!=arr[i]){
				System.out.println("Not a palindrome");
				break;
			}
			st.pop();
			i++;
		}
		if(i==arr.length){
			System.out.println("Palindrome");
		}
	}
}
