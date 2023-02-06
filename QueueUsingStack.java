/*
 * Video : https://www.youtube.com/watch?v=ma1S6vtkw9I
 * 
 * Algorithm:
 *   1)For Enqueue push in stack1.
 *   2)For Dequeue check if stack2 is empty:
 *     a)If empty transfer stack1 to stack2,then pop stack2.
 *     b)If not empty pop from stack2.
 *   3)Last check if Queue is empty(stack1+stack2):
 *     a)If empty return true.
 *     b)Else return false.  
 *   4)Last check size of Queue(stack1+stack2) and return.  
 *    
 */
package stacks;

//import java.util.Stack;
//This package is from Stack, which is written by me
import stacks.Stack;

public class QueueUsingStack {
	static Stack stack1 =new Stack();
	static Stack stack2 =new Stack();
	
	static void enqueue(char input) {
		stack1.push(input);
	}
	
	static Character dequeue() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return (char) stack2.pop();
	}
	
	static boolean Qempty() {
		return (stack1.isEmpty() && stack2.isEmpty());
	}
	
	static int size() {
		return (stack1.size() +stack2.size());
	}
	
	/*static void display() {
		System.out.println("Size: "+size());
		for(Character ele1:stack1) {
			System.out.print(" "+ele1);
		}
		System.out.println();
		
		System.out.print("Elements in Stack2 are: ");
		for(Object ele1:stack2) {
			System.out.print(" "+ele1);
		}
		System.out.println();
		
	}
	*/
	
	/*
	 *Queue using stack
	 * if(!queue2.isEmpty()) {
				item=queue2.dequeue();
			}
			else {
				for(int i=0;i<queue1.size-1;i++) {
					queue2.enqueue(queue1.dequeue());
				}
				item=queue2.dequeue();
			}
	 */

	public static void main(String[] args) {
		enqueue('s');
		enqueue('h');
		enqueue('y');
		enqueue('a');
		enqueue('m');
		enqueue('a');
		enqueue('l');
		enqueue('d');
		enqueue('a');
		enqueue('y');
		char d1= dequeue();
		System.out.println("Removed element is: "+d1);
		char d2= dequeue();
		System.out.println("Removed element is: "+d2);
		char d3= dequeue();
		System.out.println("Removed element is: "+d3);
		char d4= dequeue();
		System.out.println("Removed element is: "+d4);
		char d5= dequeue();
		System.out.println("Removed element is: "+d5);
		
		int s=size();
		System.out.println("Size of Queue element is: "+s);
		boolean e=Qempty();
		System.out.println("Queue Empty ?: "+e);
		enqueue('s');
		enqueue('h');
		enqueue('y');
		enqueue('a');
		enqueue('m');
		stack1.display("Stack1");
		stack2.display("Stack2");		

	}

}
