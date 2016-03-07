/**
 *  Remove consecutive duplicate elements from singly linked-list
 */

import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    public String toString() {
        return "" + data;
    }
    
    public boolean equals(Object other) {
        return this.data == ((Node)other).data;
    }
    
    @Override
    public int hashCode() {
        return this.hashCode();
    }
}

public class Solution {
    public static Node removeDuplicates(Node head) {
        Node previous = head;
        Node current = head.next;
        int count = 1;
        
        while(current != null) {
            if(previous.equals(current)) {
                previous.next = current.next;
                
                Node temp = current.next;
                current.next = null;
                current = temp;
            } else {
                previous = current;
                current = current.next;
                count++;
            }
        }
        
        System.out.println("Count = " + count);
        
        return head;
    }
    
    public static void main(String args[])
    {
        // Create test list
        Node mylist = new Node(10, new Node(20, new Node(30, new Node(30, new Node(40, null)))));
        
        // Sample input: 10->20->30->30->40
        // Output: 10->20->30->40->
        
        // Remove consecutive duplicates
        Node result = Solution.removeDuplicates(mylist);
        
        // Print result
        Node current = result;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
}
