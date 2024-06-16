package src;

public class Stackss {
	    int data;
	    Stackss next;

	    public Stackss(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Stack {
		Stackss top;

	    public Stack() {
	        this.top = null;
	    }

	    public void push(int data) {
	    	Stackss newNode = new Stackss(data);
	        if (top == null) {
	            top = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	    }

	    public int pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        int popped = top.data;
	        top = top.next;
	        return popped;
	    }

	    public int peek() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return top.data;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }
	

	 
	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(11);
	        stack.push(22);
	        stack.push(33);
	        
	        System.out.println("Top element: " + stack.peek());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Top element after pop: " + stack.peek());
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
	}