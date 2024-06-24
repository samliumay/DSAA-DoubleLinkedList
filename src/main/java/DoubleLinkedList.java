import java.awt.image.renderable.ContextualRenderedImageFactory;

public class DoubleLinkedList {

  private Node tail;
  private Node head;
  private int size;

  public DoubleLinkedList(int value) {
    Node newNode = new Node(value);
    tail = newNode;
    head = newNode;
    size = 1;
  }

  public void append(int value) {
    Node newNode = new Node(value);

    if (size == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.setNext(newNode);
      newNode.setPrev(tail);
      tail = newNode;
    }
    size++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);

    if (size == 0) {
      head = newNode;
      tail = newNode;
    } else {
      head.setPrev(newNode);
      newNode.setNext(head);
      head = newNode;
    }
    size++;
  }

  public Node removeLast() {
    Node temp = tail;
    if (size == 0) {
      return null;
    } else {
      tail = tail.getPrev();
      tail.setNext(null);
      temp.setPrev(null);
    }

    size--;
    return temp;
  }

  public Node removeFirst() {
    Node temp = head;
    if (size == 0) {
      return null;
    } else if (size == 1) {
      head = null;
      tail = null;
    }else{
      head = head.getNext();
      temp.setNext(null);
      head.setPrev(null);
    }

    size--;
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= size) {
      return null;
    }

    Node temp;
    if(index < size/2){
      temp = head;
      for (int i = 0; index > i; i++) {
        temp = temp.getNext();
      }
    }
    else{
      temp = tail;
      for(int i = size-1; i>index;i-- ){
        temp = temp.getPrev();
      }
    }
    return temp;

  }

  public boolean set(int index, int value) {
    Node temp = get(index);

    if (temp != null) {
      temp.setValue(value);
      return true;
    }

    return false;
  }

  public boolean instert(int index, int value) {
    if (index < 0 || index > size) {
      return false;
    } else if (index == 0) {
      prepend(value);
    } else if (index == size) {
      append(value);
    } else {
      Node newNode = new Node(value);
      Node temp = get(index - 1);
      newNode.setNext(temp.getNext());
      newNode.setPrev(temp);
      temp.getNext().setPrev(newNode);
      temp.setNext(newNode);

    }
    size++;
    return true;

  }

  public Node remove(int index) {
    if (index < 0 || index > size) {
      return null;
    } else if (index == 0) {
      size--;
      return removeFirst();
    } 

    Node current = get(index);
    Node temp = get(index - 1);

    temp.setNext(current.getNext());
    current.getNext().setPrev(temp);
    current.setNext(null);
    current.setPrev(null);

    size--;

    return current;

  }

  
  public Node getTail() {
    return tail;
  }

  public Node getHead() {
    return head;
  }

  public int getSize() {
    return size;
  }

  public void printList() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.getValue() + " -> ");
      temp = temp.getNext();
    }

    System.out.print("null \n");
  }

}