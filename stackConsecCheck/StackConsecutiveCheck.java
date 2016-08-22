package stackConsecCheck;

import java.util.Stack;

public class StackConsecutiveCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<Integer>();
		st.push(4);
		st.push(5);
		st.push(-2);
		st.push(-3);
		st.push(11);
		st.push(10);
		st.push(5);
		st.push(6);
		st.push(20);
		boolean result=chk(st);
		if(result==true){
			System.out.println("Correct");
		}
		else{
			System.out.println("Incorrect");
		}
	}
	public static boolean chk(Stack<Integer> st){
		Stack<Integer> tmp= new Stack<Integer>();
		int n=st.size();
		if(n%2!=0){
			st.pop();
			while(!st.isEmpty()){
				if(tmp.size()%2==0){
					tmp.push(st.pop());
				}
				else{
					if((tmp.peek()==st.peek()-1)||(tmp.peek()==st.peek()+1)){
						tmp.push(st.pop());
						continue;
					}
					else{
						return false;
					}
				}
			}
				return true;
		}
		else{
			while(!st.isEmpty()){
				if(tmp.size()%2==0){
					tmp.push(st.pop());
				}
				else{
					if((tmp.peek()==st.peek()-1)||(tmp.peek()==st.peek()+1)){
						tmp.push(st.pop());
						continue;
					}
					else{
						return false;
					}
				}
			}
				return true;
		}
	}
}
