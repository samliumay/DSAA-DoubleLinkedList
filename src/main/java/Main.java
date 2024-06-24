
public class Main {
  public static void main(String[] args) {

    DoubleLinkedList doubleLinkedList = new DoubleLinkedList(1);
    
    System.out.println("Testing the append function.");
    
    System.out.print("Before append: ");
    doubleLinkedList.printList();
    doubleLinkedList.append(2);
    doubleLinkedList.append(3);
    doubleLinkedList.append(4);
    doubleLinkedList.append(5);
    System.out.print("After append: ");
    doubleLinkedList.printList();
    System.out.println("");

    System.out.println("Testing the prepend function.");
    System.out.print("Before prepend: ");
    doubleLinkedList.printList();
    doubleLinkedList.append(0);
    System.out.print("After prepend: ");
    doubleLinkedList.printList();
    System.out.println("");

    System.out.println("Testing the removeFirst function.");
    System.out.print("Before removeFirst: ");
    doubleLinkedList.printList();
    doubleLinkedList.removeFirst();
    System.out.print("After removeFirst: ");
    doubleLinkedList.printList();
    System.out.println("");

    System.out.println("Testing the get function.");
    System.out.print("Getting the node at index 2: ");
    System.out.println(doubleLinkedList.get(2).getValue());
    System.out.print("Checking does the get method bring the true value: ");
    doubleLinkedList.printList();
    System.out.println("");

    System.out.println("Testing the insert function.");
    System.out.print("Before inserting 10 to index 3: ");
    doubleLinkedList.printList();
    doubleLinkedList.instert(3, 10);
    System.out.print("After inserting 10 to index 3: ");
    doubleLinkedList.printList();
    System.out.println("");

    System.out.println("Testing the remove function.");
    System.out.print("Before removing index 3: ");
    doubleLinkedList.printList();
    doubleLinkedList.remove(3);
    System.out.print("After removing index 3: ");
    doubleLinkedList.printList();
    System.out.println("");
    
    
    
    
  }
}