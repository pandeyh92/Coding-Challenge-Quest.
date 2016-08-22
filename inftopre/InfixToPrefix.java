package inftopre;

import java.util.Stack;

public class InfixToPrefix {
	public static Stack<Character> st= new Stack<Character>();
	public static StringBuilder sb = new StringBuilder();
	public static String[] operators={"+","-","*","/","^"}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a-b+c*(d/e-(f+g))";
		infToPrefix(str);
	}
	public static void infToPrefix(String str){
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='('){
				st.push(ch);
			}
			else if(ch=='^'){
				
			}
		}
	}

}
