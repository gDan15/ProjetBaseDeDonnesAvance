import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.mongodb.DBObject;

public class Operation {
	static Deque<DBObject> listToStackOrder(List<DBObject> liste, String column) {
		Deque<DBObject> stackUser = new ArrayDeque(liste);
		Deque<DBObject> stack = new LinkedList<>();
		stack.add(stackUser.pop());
		while(stackUser.peek()!=null) {
			if((int) stack.peekFirst().get("price") < (int) stackUser.peekFirst().get("price")){
				while((int) stack.peekLast().get("price") > (int) stackUser.peekFirst().get("price")) {
					stackUser.addLast(stack.removeLast());
				}
				stack.addLast(stackUser.pop());
			}
		}
		return stack;
	}
	static List<DBObject> stackToList(Deque<DBObject> stack){
		List<DBObject> liste = new ArrayList<DBObject>();
		while(stack.peek()!=null) {
			liste.add(stack.pop());
		}
		return liste;
	}
	static List<DBObject> orderList(List<DBObject> liste, String column){
		return stackToList(listToStackOrder(liste, column));
	}
}
