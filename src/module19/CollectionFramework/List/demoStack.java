package module19.CollectionFramework.List;
import java.util.Stack;
public class demoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		System.out.println(st.empty());
//		System.out.println(st.peek()); EmptyStackException
//		System.out.println(st.pop()); EmptyStackException
		System.out.println(st.push(10));
		st.push(14);
		st.push(16);
		st.push(12);
		st.push(13);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
	}
	

}
