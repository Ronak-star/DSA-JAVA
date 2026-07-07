// Implemeantation of queue using array

// public class Queues {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear = -1;
//         Queue(int n) {
//             size = n;
//             arr = new int[n];
//         }
//         public static boolean isEmpty() {
//             return rear == -1;
//         }
//         // Enqueue
//         public static void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Full Queue");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }
//         // Dequeue
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             int front = arr[0];
//             for (int i = 0; i < rear; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             rear--;
//             return front;
//         }
//         // Peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }





// Implementation circuler queue using array




// public class Queues {

//     static class Queue {

//         static int arr[];
//         static int size;
//         static int rear = -1;
//         static int front = -1;

//         Queue(int n) {
//             size = n;
//             arr = new int[n];
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull() {
//             return (rear + 1) % size == front;
//         }

//         // Enqueue
//         public static void add(int data) {
//             if (isFull()) {
//                 System.out.println("Full Queue");
//                 return;
//             }
// // 1st element add
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         // Dequeue
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             int result = arr[front];

//             // Single element
//             if (rear == front) {
//                 rear = -1;
//                 front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }

//             return result;
//         }

//         // Peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             return arr[front];
//         }
//     }

//     public static void main(String[] args) {

//         Queue q = new Queue(5);

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }


// queue using linked list

 



// public class Queues {
//   static class Node{
//      int data;
//      Node next;

//      Node(int data){
//       this.data = data;
//       next = null;
//      }

//   }

//     static class Queue {
//        static Node head = null;
//        static Node tail = null;
   
      

//         public static boolean isEmpty() {
//             return head == null & tail ==  null;
//         }

        
//         // Enqueue
//         public static void add(int data) {
//            Node newNode = new Node(data);
//           if(tail == null){
//             tail = head = newNode;
//             return;
//           }
           
//             tail.next = newNode;
//             tail = newNode;

//         }

//         // Dequeue
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//           int front = head.data;
//           if(head == tail){
//             tail = null;
//           }
//           head = head.next;

//           return front;
           
//         }

//         // Peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String[] args) {

//         Queue q = new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
        
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }



// queue using collection framework

// import java.util.*;

// public class Queues {
  
//     public static void main(String[] args) {
//    // Queue<Integer> q = new LinkedList<>();
//       Queue<Integer> q = new ArrayDeque<>();
    

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
        
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }






// import java.util.*;

// public class Queues {
//     static class Queue{
//       static Stack<Integer> s1 = new Stack();
//       static Stack<Integer> s2 = new Stack();

//       public static boolean isEmpty(){
//         return s1.empty();
      
//       }
//       public static void add(int data){
//         while(!s1.empty()){
//           s2.push(s1.pop());
//         }
//         s1.push(data);

//         while(!s2.isEmpty()){
//           s1.push(s2.pop());
//         }
//       }

//       public static int remove(){
//         if(isEmpty()){
//           System.out.println("empty queue");
//           return -1;
//         }
//        return  s1.pop();
//       }


//         public static int peek(){
//         if(isEmpty()){
//           System.out.println("empty queue");
//           return -1;
//         }
//        return  s1.peek();
//       }
      

//     }
//     public static void main(String[] args) {
 
//     Queue q = new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
        
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }