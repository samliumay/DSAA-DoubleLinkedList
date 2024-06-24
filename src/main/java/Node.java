public class Node {

  // Value we want to maintain inside the Node.
  private int value;

  // Value to maintain the references to the next node.
  private Node next;

  private Node prev;

  // Constructor 1 (We are puting the value of this node and next node at the same
  // time. )
  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  // Constructor 2 (We are just putting the Value of this node.)
  public Node(int value) {
    this.value = value;
    next = null;
  }

  // Getters and setters
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getPrev() {
    return prev;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }

}