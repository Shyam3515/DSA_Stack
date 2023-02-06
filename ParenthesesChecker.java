/*
 *  Link : https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 *  Question : Given an expression string exp, write a program to examine whether the 
 *  pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
 *  
 *  Example: 
	Input: exp = “[()]{}{[()()]()}” 
	Output: Balanced
	
	Input: exp = “[(])” 
	Output: Not Balanced 
	
 *	Algorithm: 

	1)Declare a character stack S.
	2)Now traverse the expression string exp. 
		a)If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
		b)If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack 
		and if the popped character is the matching starting bracket then fine else brackets are not balanced.
	3)After complete traversal, if there is some starting bracket left in stack then “not balanced”.
	
 * Time Complexity: O(n) 
   Auxiliary Space: O(n) for stack. 	
   
 */

package stacks;

import java.util.Stack;

public class ParenthesesChecker {
	static Stack<Character> stack =new Stack<Character>();
	static boolean balanceCheck(String exp,int n) {
		//Stack<Character> stack =new Stack<Character>();
		for(int i=0;i<n;i++) {
			char ch=exp.charAt(i);
			if(ch=='(' || ch== '{' || ch== '[') {
				stack.push((ch));	
			}
			
			// If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
			 if (stack.isEmpty())
	                return false;
	            char check;
	            switch (ch) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }
	 
	        // Check Empty Stack
	        return (stack.isEmpty());
	    }

	
	void display() {
		System.out.println("Elements in stack are: ");
		for(Character ele:stack)
			System.out.print(ele+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		 String exp = "[()]{}{[()()]()}";
		 int n=exp.length();
		 ParenthesesChecker p=new ParenthesesChecker();
		// Function call
		 if (balanceCheck(exp,n))//  if function is true
	            System.out.println("The given expression is Balanced ");
	        else
	            System.out.println("The given expression is Not Balanced ");
		 p.display();

	}

}
