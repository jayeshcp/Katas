import java.util.*;

class RemoveDuplicates {
  static class Node {
    int data;
    Node next;
    
    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public static Node removeDups(Node head) {
    if(head == null) {
      return null;
    }
    
    Node current = head;
    Node previous = head;
    Map<Integer, Node> map = new HashMap<Integer, Node>();
    
    while(current.next != null) {
      if(!map.containsKey(current.data)) {
        map.put(current.data, current);
      } else {
        // found duplicate node
        // remove it
        if(previous != null) {
          if(previous.equals(head)) {
            head = previous.next;
          } else {
            previous.next = current.next;
            current.next = null;
          }
        }
      }
      
      previous = current;
    }
    
    return head;
  }
}
