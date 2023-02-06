/*
 * Video : https://www.youtube.com/watch?v=ufwPuyxkNVE
 * 
 * Algorithm:
  		1.if top(stack1) < top(stack2){
  			push in stack2
  		  }
  		2.if popElement == top(stack2){
  			pop.
  		  } 
  		  
 * Expected Time Complexity : O(1) for all the 3 methods.
   Expected Auixilliary Space : O(1) for all the 3 methods.
 * 
 */
package stacks;

public class GetMinElement {
	static Stack stack1 =new Stack();
	static Stack stack2 =new Stack();
	
	void push(int input) {
		if(stack1.isEmpty()) {
			stack1.push(input);
			Object p = stack1.peek();
			stack2.push(p);
		}
		else {
		stack1.push(input);
		}
		
		if((int) stack1.peek() <= (int) stack2.peek()) {
			stack2.push(stack1.peek());
		}
	}
	
	void pop() {
		int p1,p2;
		if(stack1.peek() == stack2.peek()) {
			p1=(int) stack1.pop();
			p2=(int) stack2.pop();
			//System.out.println("p1:"+p1);
			//System.out.println("p2:"+p2);
		}
		else {	
		  p1=(int)stack1.pop();
		//System.out.println("p11:"+p1);
		}
	}
	
	Object getMin() {
		return stack2.peek();
	}
	
	public static void main(String[] args) {
		GetMinElement g =new GetMinElement();
		g.push(10);
		g.push(1);
		g.push(3);
		g.push(0);
		g.push(20);
		g.push(-1);
		g.push(-2);
		g.push(-3);
		g.push(10);
		g.push(1);
		g.push(3);
		System.out.println("Min1 :"+g.getMin());
		//stack1.display("stack1");
		//stack2.display("stack2");
		g.pop();		
		g.pop();		
		g.pop();		
		g.pop();		
		System.out.println("Min2 :"+g.getMin());
		g.pop();
		//stack1.display("stack1");
		//stack2.display("stack2");
		System.out.println("Min3 :"+g.getMin());
		g.pop();
		//stack1.display("stack1");
		//stack2.display("stack2");
		System.out.println("Min2 :"+g.getMin());
		
	}

}
