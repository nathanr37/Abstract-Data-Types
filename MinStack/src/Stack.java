import java.util.ArrayList;

public class Stack<Integer> {

	ArrayList<Integer> data;

	public Stack() {
		data = new ArrayList<Integer>();
	}

	public void push(Integer t) {
		data.add(0, t);
	}

	public int pop() {
		if (data.isEmpty()) {
			return 0;
		} else {
			return (int) data.remove(0);
		}
	}

	public int size() {
		return data.size();
	}

	public boolean empty() {
		return data.isEmpty();
	}

	public int peek() {
		if (data.size() == 0) {
			return -1;
		} else {
			return (int) data.get(0);
		}
	}

}