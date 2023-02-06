//Customised API
/*
 * Video : https://www.youtube.com/watch?v=bxRVz8zklWM&t=1s
 */
package stacks;

import java.util.ArrayList;
public class Stack {
	int size=10;
	//int stack[]=new int[size];
	//Static Memory Allocation
	ArrayList<Object> stack=new ArrayList<Object>();
	int top=-1;
	void push(Object object) {
		//System.out.println("Push Method:");
		try{
			top++;
			if(top<size) {
				stack.add(top,object);
				//System.out.println("top: "+stack.get(top)+", "+top);
			}
			else {
	
				throw new ArrayIndexOutOfBoundsException("Overflow Condition...");
			}
		}
	    catch(ArrayIndexOutOfBoundsException e) {
	    	top--;
	    	System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(e.getMessage());  
            //e.printStackTrace();  
		}
		//System.out.println();
	}
	
	Object pop() {
		//System.out.println("Pop Method:");
		Object item = null;
		try {
			if(top>=0) {
			item=stack.get(top); //stack[top];
			stack.remove(top);
			//System.out.println("Popped Element is: "+item);
			top--;
			}
			else {
				
				throw new ArrayIndexOutOfBoundsException("Underflow Condition...");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(top);
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println();
		return item;
	}
	
	Object peek() {
		//System.out.println("Peek Method:");
		if(top==-1) {
			System.out.println("Stack is empty...");
		}
		else {
			//System.out.println("The top element is: "+returnTop());
		}
		return stack.get(top);
	}
	
	Object returnTop() {
		return stack.get(top); //stack[top];
	}
	
	int size() {
		return top;	
	}
	
	boolean isEmpty() {
		return top==-1? true:false;
	}
	
	void display(String name) {
		if(top==-1) {
			System.out.println("Stack is empty...");
			return;
		}
		System.out.println("Elements in "+name+" are: ");
		for(Object ele:stack)
			System.out.print(ele+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push(1);
		s.push(4);
		s.push(1);
		s.display("shyam");
		s.push(7);
		Object y=s.pop();
		System.out.println("The popped element is: "+y);
		s.push(2);
		int p=(int) s.peek();
		System.out.println("The top most element is: "+p);
		
		int size=s.size();
		System.out.println("The size of stack is: "+size);
		
		boolean isempty=s.isEmpty();
		System.out.println("Is the stack Empty?: "+isempty);
		
		s.display("stack");

	}
}
