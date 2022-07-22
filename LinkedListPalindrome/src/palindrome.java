import java.util.Stack;

public class palindrome {
	
	public static void main(String[] a) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(1);
		
		n1.next =n2;
		n2.next =n3;
		n3.next =n4;
		n4.next =n5;
		
		boolean output= isPalindrome(n1);
		System.out.println("Is the given Linked List is palindrome:"+ output);		
	}
	
	static class Node{
		int data;
		Node next;
		Node(int temp){
			data=temp;
		}
	}
	
	static boolean isPalindrome(Node head) {
		Node tempNode = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(tempNode!=null) {
			stack.push(tempNode.data);
			tempNode = tempNode.next;
		}
		while(head!=null) {
			if(head.data != stack.pop()) {
				return Boolean.FALSE;
			}
			head = head.next;
		}
		
		return Boolean.TRUE;
		
	}
	

}
