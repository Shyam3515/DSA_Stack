/*
 * Link  : https://www.geeksforgeeks.org/next-greater-element/
 * Video : https://www.youtube.com/watch?v=sDKpIO2HGq0
 * Question : Given an array, print the Next Greater Element (NGE) for every element. 
     The Next greater Element for an element x is the first greater element on the right side of x in the array.
     Elements for which no greater element exist, consider the next greater element as -1. 
     
     Examples: 
		For an array, the rightmost element always has the next greater element as -1.
		For an array that is sorted in decreasing order, all elements have the next greater element as -1.
		For the input array [4, 5, 2, 25], the next greater elements for each element are as follows.
		
		Element        NGE
		   4      -->   5
		   5      -->   25
		   2      -->   25
		   25     -->   -1   
		   
 * Method 2 (Using Stack) 

	1)Push the first element to stack.
	2)Pick rest of the elements one by one and follow the following steps in loop. 
		a)Mark the current element as next.
		b)If stack is not empty, compare top element of stack with next.
		c)If next is greater than the top element, Pop element from stack.
		  Next is the next greater element for the popped element.
		d)Keep popping from the stack while the popped element is smaller than next. 
		  Next becomes the next greater element for all such popped elements.
	3)Finally, push the next in the stack.
	4)After the loop in step 2 is over, pop all the elements from the stack and print -1 as the next element for them.
 *
 *Time Complexity/Space Complexity:
 *    O(n)/O(n)   			   
 */

package stacks;

import java.util.Stack;

public class NextGreaterElement {
	Stack<Integer> stack =new Stack<Integer>();
	/* prints element and NGE pair for all 
	elements of arr[] of size n */
	void printNGE(int arr[],int n) {
		System.out.println("Elements With corresponding NGE are: ");
		/* push the first element to stack */
		stack.push(arr[0]);
		
		for(int i=1;i<n;i++) {
			if(stack.isEmpty()) {
				stack.push(arr[i]);
				continue;
			}
			//5,3,7,2,8,9,4,5
			/* if stack is not empty, then 
			pop an element from stack. 
			If the popped element is smaller 
			than next, then 
			a) print the pair 
			b) keep popping while elements are 
			smaller and stack is not empty */
			//While loop continues till stack is empty
			while(stack.isEmpty()==false && stack.peek()<arr[i]) {
				//Printing elements 
				for(Object ele:stack)
					System.out.print(ele+" ");
				System.out.println();
				//Printing pairs 
				System.out.println(stack.peek() +"-->"+arr[i]+"  ");
				stack.pop();
			}
			/* push next to stack so that we can find 
			next greater for it */
			stack.push(arr[i]);
		}
		/* After iterating over the loop, the remaining 
		elements in stack do not have the next greater 
		element, so print -1 for them */
		while(stack.isEmpty()==false) {
			System.out.print(stack.peek() +"-->"+ "-1  ");
			stack.pop();
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,3,7,2,8,9,4,5};
		int n=arr.length;
		NextGreaterElement g=new NextGreaterElement();
		g.printNGE(arr,n);
	}

}
