import java.util.Stack;

public class Test {
	public static void main(String[] args) {

		String st = "jaya(kumar";
		Stack<Character> st1 = new Stack<Character>();

		for (int i = 0; i < st.length(); i++) {
			st1.push(st.charAt(i));
		}
		System.out.println(st1.size());

		for (int i = 0; i < st1.size(); i++) {
			char ch = st1.get(i);

			System.out.println(ch);

		}

	}
}
