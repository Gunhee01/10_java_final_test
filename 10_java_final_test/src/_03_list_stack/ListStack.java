package _03_list_stack;

interface Stack{
	
	boolean isEmpty();
	void push(char item);
	char pop();
	char peek();
	
}

class StackNode{
	
	char data;
	StackNode link;
	
}


class LinkedStack implements Stack{
	
	private StackNode top;
		
	public boolean isEmpty(){
		return (top == null);
	}
	
	
	public void push(char item){
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item : " + item);
	}
	
	
	public char pop(){
		
		if (isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {  
			char item = top.data;
			top = top.link;
			return item;	
		}
		
	}
	
	
	public char peek() {
		
		if (isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			return top.data;	
		}
		
	}
	
	
	public void printStack() {
		
		if (isEmpty()) {
			System.out.printf("Linked Stack is empty!! %n %n");
		}
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while (temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();	
		}
		
	}
	
}

public class ListStack{
	public static void main(String args[]){	
		
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deletedItem = LS.pop();
		if (deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LS.printStack();
		
	}
}