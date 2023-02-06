package stacks;

import java.util.Stack;

public class StackOperations {
	static int size=5;
	//Here we are using static as we are not created the object
	static void stackPush(Stack<Integer> stack) { 
		for(int i=0;i<size;i++) {
			stack.push(i);	
		}
		System.out.println("Elements in Stack: "+stack);
	}
	
	static void stackPop(Stack<Integer> stack) {
		System.out.println("Pop OPeration:");
		// Taken (size-1) to leave one element, to display in peek,otherwise stack will be empty
		for(int i=0;i<size-1;i++) { 
			Integer ele=(Integer) stack.pop();
			System.out.println(ele+" ");
		}
	}
	
	static void stackPeek(Stack<Integer> stack) {
		Integer ele =(Integer) stack.peek();
		System.out.println("The top element of stack is: "+ele);
	}

	public static void main(String[] args) {
		Stack<Integer> stack =new Stack<Integer>();
		stackPush(stack);
		stackPop(stack);
		stackPeek(stack);

	}

}
