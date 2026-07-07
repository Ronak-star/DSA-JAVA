





// class LinkedLists{
//   Node head;
//   private int size;

//   LinkedLists(){
//     this.size = 0;
//   }
//   class Node{
//     String data;
//     Node next;
  
//     Node(String data){
//       this.data = data;
//       this.next = null;
//       size++;
//     }
//   }

//   // add - first , last
//   public void addFirst(String data){
//     Node newNode = new Node(data);
//     if(head == null){
//         head = newNode;
//         return;
//     }
//     newNode.next = head;
//     head = newNode;
//   }

//   // add - last

//   public void addLast(String data){
//       Node newNode = new Node(data);
//       if(head == null){
//         head = newNode;
//         return;
//       }

//       Node curraNode = head;
//       while(curraNode.next != null){
//         curraNode = curraNode.next;
//       }

//       curraNode.next = newNode;

//   }

//   // print
//   public void printList(){
//     if(head == null){
//       System.out.println("list is empty");
//       return;
//     }
//     Node currNode = head;
//     while(currNode != null){
//       System.out.print(currNode.data + " -> ");
//       currNode = currNode.next;
//     }
//     System.out.println("NULL");
//   }

//   // delete first
//   public void deleteFirst(){
//     if(head == null){
//       System.out.println("The list is empty");
//       return;
//     }
//     size--;
//     head = head.next;
//   }


//   // delete last
//   public void deleteLast(){
  
//     if(head == null){
//       System.out.println("The list is empty");
//       return;
//     }
//       size--;

//     if(head.next == null){
//       head = null;
//       return;
//     }

//     Node secondLast = head;
//     Node lastNode = head.next; 
//     while(lastNode.next != null){
//       lastNode = lastNode.next;
//       secondLast = secondLast.next;
//     }

//     secondLast.next = null;
//   }
//   public int getSize(){
//     return size;
//   }
//   public static void main(String[] args) {
//      LinkedLists list = new LinkedLists();
//      list.addFirst("a");
//      list.addFirst("is");
//      list.printList();

//      list.addLast("list");
//      list.printList();

//      list.addFirst("this");
//      list.printList();

//      list.deleteFirst();
//      list.printList();

//      list.deleteLast();
//      list.printList();

//      System.out.println(list.getSize());

//      list.addFirst("this");
//      System.out.println(list.getSize());

//     }
// }


// using collection framework

// import java.util.*;

// class LinkedLists{
//   public static void main(String[] args) {
//       LinkedList<String> list = new LinkedList<String>();

//       list.addFirst("a");
//       list.addFirst("is");
//       System.out.println(list);

//       list.addFirst("this");
//       list.addLast("list");
//        System.out.println(list);

//        System.out.println(list.size());

//        for(int i=0; i<list.size(); i++){
//         System.out.print(list.get(i)+ " -> ");
//        }
//        System.out.println("null");

//        list.removeFirst();
//        System.out.println(list);

//        list.removeLast();
//        System.out.println(list);

//        list.remove(0);
//        System.out.println(list);
//   }
// }


// How to Reverse a Linked list Iterative + Recursive

// Iterative
// class LinkedLists{
//   Node head;
//   private int size;

//   LinkedLists(){
//     this.size = 0;
//   }
//   class Node{
//     int data;
//     Node next;
  
//     Node(int data){
//       this.data = data;
//       this.next = null;
//       size++;
//     }
//   }

//   // add - first , last
//   public void addFirst(int data){
//     Node newNode = new Node(data);
//     if(head == null){
//         head = newNode;
//         return;
//     }
//     newNode.next = head;
//     head = newNode;
//   }

//   // add - last

//   public void addLast(int data){
//       Node newNode = new Node(data);
//       if(head == null){
//         head = newNode;
//         return;
//       }

//       Node curraNode = head;
//       while(curraNode.next != null){
//         curraNode = curraNode.next;
//       }

//       curraNode.next = newNode;

//   }

//   // print
//   public void printList(){
//     if(head == null){
//       System.out.println("list is empty");
//       return;
//     }
//     Node currNode = head;
//     while(currNode != null){
//       System.out.print(currNode.data + " -> ");
//       currNode = currNode.next;
//     }
//     System.out.println("NULL");
//   }

//   // delete first
//   public void deleteFirst(){
//     if(head == null){
//       System.out.println("The list is empty");
//       return;
//     }
//     size--;
//     head = head.next;
//   }


//   // delete last
//   public void deleteLast(){
  
//     if(head == null){
//       System.out.println("The list is empty");
//       return;
//     }
//       size--;

//     if(head.next == null){
//       head = null;
//       return;
//     }

//     Node secondLast = head;
//     Node lastNode = head.next; 
//     while(lastNode.next != null){
//       lastNode = lastNode.next;
//       secondLast = secondLast.next;
//     }

//     secondLast.next = null;
//   }
//   public int getSize(){
//     return size;
//   }

//   public void reverseIterate(){
  
//     if(head == null || head.next == null){
//       return;
//     }
//     Node prevNode = head;
//     Node currNode = head.next;
//     while(currNode != null){
      
//       Node nextNode = currNode.next;
//       currNode.next = prevNode;

//       //update
//       prevNode = currNode;
//       currNode = nextNode;
//     }
//     head.next = null;
//     head = prevNode;
//   }
//   public static void main(String[] args) {
//      LinkedLists list = new LinkedLists();
    
//      list.addLast(1);
//      list.addLast(2);
//      list.addLast(3);
//      list.addLast(4);

//      list.printList();

//      list.reverseIterate();
//      list.printList();

//     }
// }


// Recursive

//  class LinkedLists{
//   Node head;
//   private int size;

//   LinkedLists(){
//     this.size = 0;
//   }
//   class Node{
//     int data;
//     Node next;
  
//     Node(int data){
//       this.data = data;
//       this.next = null;
//       size++;
//     }
//   }

//   // add - first , last
//   public void addFirst(int data){
//     Node newNode = new Node(data);
//     if(head == null){
//         head = newNode;
//         return;
//     }
//     newNode.next = head;
//     head = newNode;
//   }

//   // add - last

//   public void addLast(int data){
//       Node newNode = new Node(data);
//       if(head == null){
//         head = newNode;
//         return;
//       }

//       Node curraNode = head;
//       while(curraNode.next != null){
//         curraNode = curraNode.next;
//       }

//       curraNode.next = newNode;

//   }

//   // print
//   public void printList(){
//     if(head == null){
//       System.out.println("list is empty");
//       return;
//     }
//     Node currNode = head;
//     while(currNode != null){
//       System.out.print(currNode.data + " -> ");
//       currNode = currNode.next;
//     }
//     System.out.println("NULL");
//   }

//   // delete first
//   public void deleteFirst(){
//     if(head == null){
//       System.out.println("The list is empty");
//       return;
//     }
//     size--;
//     head = head.next;
//   }


//   // delete last
//   public void deleteLast(){
  
//     if(head == null){
//       System.out.println("The list is empty");
//       return;
//     }
//       size--;

//     if(head.next == null){
//       head = null;
//       return;
//     }

//     Node secondLast = head;
//     Node lastNode = head.next; 
//     while(lastNode.next != null){
//       lastNode = lastNode.next;
//       secondLast = secondLast.next;
//     }

//     secondLast.next = null;
//   }
//   public int getSize(){
//     return size;
//   }

//   public void reverseIterate(){
  
//     if(head == null || head.next == null){
//       return;
//     }
//     Node prevNode = head;
//     Node currNode = head.next;
//     while(currNode != null){
      
//       Node nextNode = currNode.next;
//       currNode.next = prevNode;

//       //update
//       prevNode = currNode;
//       currNode = nextNode;
//     }
//     head.next = null;
//     head = prevNode;
//   }

//   public Node reverseRecursive(Node head){
//     if(head ==  null || head.next == null){
//       return head;
//     }
//     Node newHead = reverseRecursive(head.next);
//     head.next.next = head;
//     head.next = null;

//     return newHead;
//   }
//   public static void main(String[] args) {
//      LinkedLists list = new LinkedLists();
    
//      list.addLast(1);
//      list.addLast(2);
//      list.addLast(3);
//      list.addLast(4);

//      list.printList();

//      list.head = list.reverseRecursive(list.head);
//      list.printList();

//     }
// }



// most important linked list questions 

 