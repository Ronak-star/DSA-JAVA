
//import java.util.Scanner;

/* 
// if else condition age is greater than 18
import java.util.Scanner;

class Condition{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Age : ");
    int age = sc.nextInt();
    
     if(age > 18){
      System.out.println("Adult");
     }
     else{
      System.out.println("Not Adult");
     }
  }
}
 */
// Even or odd

/* import java.util.Scanner;
class Condition{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int num = sc.nextInt();
    if(num%2==0){
      System.out.println("Even");

    }
    else{
      System.out.println("Odd");
    }
  }
} */
// class Condition{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the value of a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the value of b : ");
//       int b = sc.nextInt();
//       if( a > b){
//         System.out.println("a is greater");
//       }
//       if(a < b){
//         System.out.println("a is lesser");
//       }
//       else{
//         System.out.println("equal");
//       }
//   }
// }
// class Condition{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the value of a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the value of b : ");
//       int b = sc.nextInt();
//       if(a == b){
//         System.out.println("Equal");
//       }
//       else if( a > b){
//           System.out.println("a is greater");
//         }
//       else{
//           System.out.println("a is lesser");
//         }
//   }
// }
// class Condition{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the button number");
//      int button = sc.nextInt();
//      if(button == 1){
//       System.out.println("Hello");
//      } else if( button == 2){
//       System.out.println("Namste");
//      } else if (button == 3) {
//          System.out.println("Boonzur");
//      }
//      else{
//       System.out.println("Invalid button");
//      }
//   }
// }
// class Condition{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int button = sc.nextInt();
//       switch (button) {
//           case 1:
//               System.out.println("Hello");
//               break;
//           case 2: 
//               System.out.println("Namaste");
//               break;
//           case 3: {
//             System.out.println("Boonzur");
//             break;
//           }
//           default:
//               System.out.println("Invalid number");
//       }
//   }
// }
/* Homework Problems
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */
// class Condition{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the number b : ");
//       int b = sc.nextInt();
//       int operator = sc.nextInt();
//       switch (operator)  {
//           case 1:
//             System.out.println(a+b);
//               break;
//           case 2:
//             System.out.println(a-b);
//             break;
//           case 3:
//             System.out.println(a*b);
//             break;
//           case 4:
//             if (b==0) {
//                 System.out.println("Invalid division");
//             }
//             else{
//               System.out.println(a/b);
//             }
//             break;
//           case 5:
//               if (b==0) {
//                 System.out.println("Invalid division");
//             }
//             else{
//               System.out.println(a%b);
//             }
//             break;
//           default:
//               System.out.println("Invalid operator");
//       }
//     }
// }
// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
// class Condition {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the month number : ");
//         int month = sc.nextInt();

//         switch (month) {
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("February");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("Aperial");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.err.println("August");
//                 break;
//             case 9:
//                 System.out.println("Septmeber");
//                 break;
//             case 10:
//                 System.out.println("Octumber");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;
//             default:

//         }
//     }
// }



