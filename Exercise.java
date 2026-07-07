
//     int sum = a + b + c;
//     System.out.println("Average = " + sum/3);
//   }

//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the number b : ");
//       int b = sc.nextInt();
//       System.out.print("Enter the number c : ");
//       int c = sc.nextInt();

//       printAverage(a, b, c);

//   }

// }
// Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.Scanner;

// public class Exercise {
//     public static void main(String[] args) {
//         // Create a Scanner object for user input
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the number of odd terms (n): ");
//         int n = scanner.nextInt();
        
//         // Mathematical formula: Sum = n * n
//         int totalSum = n * n;
        
//         System.out.println("The sum of the first " + n + " odd numbers is: " + totalSum);
        
//         // Close the scanner to prevent memory leaks
//         scanner.close();
//     }
// }

// class Exercise{
//   public static void printSum(int n){
//     int totalsum = n * n;
//     System.out.println("Sum = " + n + " odd numbers : " + totalsum);
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       System.err.print("Enter the number of terms : ");
//       int n = sc.nextInt();

//       printSum(n);
//   }
// }


// Write a function which takes in 2 numbers and returns the greater of those two.

// class Exercise{
//   public static int printNumber(int a, int b){
//       if(a > b){
//         return a;
//       }else{
//         return b;
//       }
//   }
//   public static void main(String[] args) {
//       Scanner sc =  new Scanner(System.in);
//       System.out.print("Enter the number of a : ");
//       int a = sc.nextInt();
//        System.out.print("Enter the number of b : ");
//       int b = sc.nextInt();
     
//        int greaterNumber = printNumber(a, b);
//         System.out.println("greater is " + greaterNumber);
//       printNumber(a, b);
//   }
// }

// Write a function that takes in the radius as input and returns the circumference of a circle.

// class Exercise{
//   public static double  circumFerence(double  radius){
//         return 2 * Math.PI * radius;
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       System.out.println("Enter the radius : ");
//       double radius = sc.nextDouble();
//       double result = circumFerence( radius);
//       System.out.println("Radius is : "+ result);

//   }
// }




// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// class Exercise{
//   public static int eligibleAge(int age){
//     if(age>=18){
//          System.out.println("eligible to vote");
//     }
//     else{
//       System.out.println("Not eligible to vote");
//     }
//     return age;
//   }
//   public static void main(String[] args) {
//       Scanner sc =  new Scanner(System.in);
//       System.out.print("Enter the Age : " );
//       int age = sc.nextInt();

//       eligibleAge(age);

//   }
// }
// Write an infinite loop using do while condition.

// class Exercise{
//   public static void main(String[] args) {
//       int i = 0;
//       while(i<11){
//         System.out.println(i);
//         //i++;
//       }
//   }
// }
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

// import java.util.Scanner;

// public class Exercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int positive = 0, negative = 0, zero = 0;
//         int num;

//         System.out.println("Numbers enter karein (Rukne ke liye 999 dalein):");

//         while (true) {
//             num = sc.nextInt(); // Number input liya

//             if (num == 999) {   // Agar 999 hai toh ruk jao
//                 break; 
//             }
//             if (num > 0) {      // Positive check
//                 positive++;
//             } else if (num < 0) { // Negative check
//                 negative++;
//             } else {            // Zero check
//                 zero++;
//             }
//         }

//         // Final Output
//         System.out.println("Positive: " + positive);
//         System.out.println("Negative: " + negative);
//         System.out.println("Zeros: " + zero);
//     }
// }


// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// import java.util.Scanner;

// public class Exercise {

//     // 1. Function jo x ki power n calculate karega
//     public static int calculatePower(int x, int n) {
//         int result = 1; // Shuru mein result ko 1 rakhenge

//         // Loop 'n' baar chalega aur 'x' ko multiply karega
//         for (int i = 1; i <= n; i++) {
//             result = result * x;
//         }

//         return result; // Final answer wapas bhejenge
//     }

//     // 2. Main function jahan se program shuru hoga
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // User se x aur n input lena
//         System.out.print("Enter base number (x): ");
//         int x = sc.nextInt();

//         System.out.print("Enter power number (n): ");
//         int n = sc.nextInt();

//         // Function ko call karna aur result store karna
//         int answer = calculatePower(x, n);

//         // Final Output (OP) print karna
//         System.out.println(x + " raised to the power of " + n + " is: " + answer);

//         sc.close();
//     }
// }


// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

// import java.util.Scanner;

// public class Exercise {
//     // Function jo GCD nikalega
//     public static int findGCD(int n1, int n2) {
//         int gcd = 1; 
        
//         // Loop dono mein se chhote number tak chalega
//         for (int i = 1; i <= n1 && i <= n2; i++) {
//             // Agar 'i' dono ko divide kare toh use gcd mein save karo
//             if (n1 % i == 0 && n2 % i == 0) {
//                 gcd = i; 
//             }
//         }
//         return gcd;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         // Function call aur output
//         int result = findGCD(num1, num2);
//         System.out.println("GCD is: " + result);

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class Exercise{
//     // Function jo fast tarike se GCD nikalega
//     public static int findGCDBonus(int n1, int n2) {
//         while (n2 != 0) {
//             int remainder = n1 % n2; // Remainder nikala
//             n1 = n2;                 // Purane n2 ko n1 banaya
//             n2 = remainder;          // Remainder ko naya n2 banaya
//         }
//         return n1; // Jab n2 zero ho jaye toh n1 hi answer hai
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         // Function call aur output
//         int result = findGCDBonus(num1, num2);
//         System.out.println("GCD (Bonus Method) is: " + result);

//         sc.close();
//     }
// }


// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)
// import java.util.Scanner;

// public class Exercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Kitne terms print karne hain? (n): ");
//         int n = sc.nextInt();

//         int a = 0; // Pehla number
//         int b = 1; // Doosra number

//         System.out.print("Fibonacci Series: ");

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " "); // Pehle 'a' ko print karenge

//             // Agla term nikalne ke liye pichle dono ko jodenge
//             int nextTerm = a + b;
//             a = b;       // b ki value a mein daal di
//             b = nextTerm; // nextTerm ki value b mein daal di
//         }
        
//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class Exercise {
    
//     // Function jo recursion se fibonacci number nikalta hai
//     public static int getFibonacci(int count) {
//         if (count == 0) return 0;
//         if (count == 1) return 1;
        
//         // Khud ko call karke pichle do terms ka sum nikalna
//         return getFibonacci(count - 1) + getFibonacci(count - 2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Kitne terms print karne hain? (n): ");
//         int n = sc.nextInt();

//         System.out.print("Fibonacci Series (Bonus): ");
        
//         // Loop se har ek position ka fibonacci number nikal kar print karenge
//         for (int i = 0; i < n; i++) {
//             System.out.print(getFibonacci(i) + " ");
//         }

//         sc.close();
//     }
// }
