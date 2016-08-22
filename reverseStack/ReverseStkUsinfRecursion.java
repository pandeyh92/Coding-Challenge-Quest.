package reverseStack;

import java.util.Stack;

public class ReverseStkUsinfRecursion {
	public static Stack<Character> st = new Stack<Character>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		st.push('e');
		reverseStack(st);
	}
	public static void reverseStack(Stack<Character> st){
		if(st.isEmpty()){
			return;
		}
		char temp=st.pop();
		reverseStack(st);
		insertAtBottom(st,temp);
	}
	public static void insertAtBottom(Stack<Character> st,char data){
		if(st.isEmpty()){
			st.push(data);
			return;
		}
		char temp=st.pop();
		insertAtBottom(st,data);
		st.push(temp);
	}

}
