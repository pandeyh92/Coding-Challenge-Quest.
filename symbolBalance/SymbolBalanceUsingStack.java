package symbolBalance;

import java.util.Stack;

public class SymbolBalanceUsingStack {
	public static Stack<Character> st = new Stack<Character>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{((a+b)){(}](c+d)}";
		chkSymbol(str);
	}
	public static void chkSymbol(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='('){
				st.push(str.charAt(i));
			}
			else if(str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')'){
				if(str.charAt(i)=='}'&& st.peek()=='{'){
					st.pop();
				}
				else if(str.charAt(i)==']'&& st.peek()=='['){
					st.pop();
				}
				else if(str.charAt(i)==')'&& st.peek()=='('){
					st.pop();
				}
				else {
					System.err.println("Invalid symbols");
					break;
				}
			}
			else {
				continue;
			}	
		}
		if(st.isEmpty()){
			System.out.println("Valid");
		}
		else{
			System.out.println("InValid");
		}
	}
}