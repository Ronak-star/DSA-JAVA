

// Q Print the Numbers from 0 to  10

//For lOOp
// class Loops{
//   public static void main(String[] args) {
//       for(int i=0; i<=10; i++){
//              System.out.println(i);
//       }
//   }
// }


// While loop

// class Loops{
//   public static void main(String[] args) {
    
//     int i = 0;
//     while(i<11){
//            System.out.println(i);
//                i++;
//     }

//       }
//   }


// do while loop

// class Loops{
//   public static void main(String[] args) {
//     int i = 0;
//       do { 
//             System.err.println(i);
//           i++;
//       } while (i<11);
//   }
// }


// print the sum of first in natural numbers
// n = 4 => 1 + 2 + 3 + 4 = 10

// class Loops{
//   public static void main(String[] args) {
//     int sum = 0;
//     int n = 4;
//     for(int i = 0; i<=n; i++){
//         sum = sum + i;
//     }
//     System.out.print(sum);
//   }
// }

// using while
// class Loops{
//   public static void main(String[] args) {
//     int sum = 0;
//     int n = 4;
//     int i = 0;
//     while(i<=n){
//       sum = sum + i;
//       i++;
//     }
//     System.out.println(sum);
//   }
// }

// using do while
// class Loops{
//   public static void main(String[] args) {
//      int i = 0;
//     int n = 4;
//     int sum = 0;
//     do{
//       sum = sum + i;
//        i++;
//     }
    
//     while(i<=n);
//      System.out.println(sum);
    
//   }
// }


// print the table of a number input by the user.
// class  Loops{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int n = sc.nextInt();
//       for(int i=1; i<=10; i++)
//       { 
//            System.out.println(n*i);
//       }
//   }
// }

// Homework Problems
// Print all even numbers till n.

// class Loops{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();

//       for(int i=0;i<=n;i++){
//         if(i%2==0){
//           System.out.println(i);
//         }
//       }
//   }
// }


// class Loops{
//   public static void main(String[] args) {
     

//       for(;;){
        
//           System.out.println("apna college");
        
//       }
//   }
// }

//  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)




// class Loops{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int num;
    

//       do {
//             System.out.println("Press 1 to enter student marks, or 0 to exit:");
//             num = sc.nextInt();

//             if (num == 1) {
//                 System.out.println("Enter student's marks (out of 100):");
//                 int marks = sc.nextInt();

            
//                 if (marks >= 90 && marks <= 100) {
//                     System.out.println("This is Good");
//                 } else if( 89>=marks && marks>=60){
//                   System.out.println("This is also Good");
//                 } else if(marks >=59 && marks>=0){
//                   System.out.println("This is Good as well");
//                 } else{
//                   System.out.println("Invalid marks");
//                 }
//                } else if (num != 0) {
//                 System.out.println("Invalid option! Please enter 1 or 0.");
//             }

       
//         } while (num != 0);

//         System.out.println("Program stopped.");
       
//     }
// }

// Qs. Print if a number is prime or not (Input n from the user). 
// [In this problem you will learn how to check if a number is prime or not]

///import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to check: ");
//         int num = sc.nextInt();
        
//         boolean isPrime = true;

//         // 1. Numbers less than or equal to 1 are not prime
//         if (num <= 1) {
//             isPrime = false;
//         } else {
//             // 2. Loop from 2 up to the square root of the number
//             for (int i = 2; i * i <= num; i++) {
//                 if (num % i == 0) {
//                     isPrime = false; // Found a factor, so it is not prime
//                     break;           // Exit the loop early to save time
//                 }
//             }
//         }

//         // 3. Print the final result
//         if (isPrime) {
//             System.out.println(num + " is a Prime Number.");
//         } else {
//             System.out.println(num + " is NOT a Prime Number.");
//         }
        
//         sc.close();
//     }
// }

// class Loops{
//     public static void main(String[] args) {
//         int num = 5;
//         boolean isPrime = true;

//         if(num<=1){
//             isPrime = false;
//         } else{
//             for(int i=2; i*i<=num; i++){
//                 if(num%i==0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime){
//             System.out.println(num + " =  Prime ");
//         }
//         else{
//             System.out.println(num + " =  Not prime ");
//         }
//     }
// }




