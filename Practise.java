
//import java.util.Scanner;




// System.out.print("Enter the value of a : ");
// int a = sc.nextInt();
// System.out.print("Enter the value of b : ");
// int b = sc.nextInt();
// System.out.print("The total is sum : ");
// int sum = a + b;
// System.out.println(sum);




//   }
// }


// if else condition age is greater than 18

// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the Age : ");
//       int age = sc.nextInt();

//       if(age>=18){
//         System.out.println("Adult");
//       }
//       else{
//         System.out.println("Not adult");
//       }
      
//   }
// }

// Even or odd

// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = sc.nextInt();

//       if(num%2==0){
//         System.out.println("Even");
//       }
//       else{
//         System.out.println("Odd");
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the value of a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the value of b : ");
//       int b = sc.nextInt();

//       if(a == b){
//         System.out.println("Equal");
//       } else if(a > b){
//         System.out.println("a is greater");
//       }
//       else{
//         System.out.println("a is lesser");
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the button number : ");
//       int button = sc.nextInt();
      
//       if(button == 1){
//         System.out.println("Hello");
//       } else if(button == 2){
//         System.out.println("Namste");
//       } else if(button == 3){
//         System.out.println("Bonzur");
//       }
//       else{
//         System.out.println("Invalid");
//       }
//   }
// }





// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the button number : ");
//       int button = sc.nextInt();
      
//      switch (button) {
//          case 1:
//           System.err.println("Hello");
//              break;
//              case 2:
//           System.err.println("Namste");
//              break;
//              case 3:
//           System.err.println("Bonzur");
//              break;
//          default:
//           System.out.println("Invalid");
            
//      }
//   }
// }



// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the value of a : " );
//       float a = sc.nextInt();
//       System.out.print("Enter the value of b : ");
//       float b =  sc.nextInt();

//       System.out.print("Enter the case = ");
//       int operator = sc.nextInt();

//       switch (operator) {
//           case 1:
//             System.out.println("Addition = "+ (a+b));
//               break;
//           case 2:
//             System.out.println("Subtraction = "+ (a-b));
//               break;
//           case 3:
//             System.out.println(a*b);
//               break;  
//           case 4:
//             if(b==0){
//               System.out.println("Invalid divisior");
//             }else{
//           System.out.println("Division = "+ (a/b));
//             }
//             break;
//           case 5:
//         if(b==0){
//               System.out.println("Invalid divisior");
//             }else{
//               System.out.println("Modulo = "+ (a%b));
//             }
//               break;
//           default:
//               System.out.println("Invalid operator");
//       }
//   }
// }



// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter month number : ");
//       int month =  sc.nextInt();

//       switch (month) {
//           case 1:
//               System.out.println("jan");
//               break;
//           case 2:
//               System.out.println("feb");
//               break;
//           case 3:
//               System.out.println("mar");
//               break;
//           case 4:
//               System.out.println("appe");
//               break;
//           case 5:
//               System.out.println("may");
//               break;
//           case 6:
//               System.out.println("june");
//               break;
//           case 7:
//               System.out.println("july");
//               break;
//           case 8:
//               System.out.println("augu");
//               break;
//           case 9:
//               System.out.println("sep");
//               break;   
//            case 10:
//               System.out.println("oct");
//               break; 
//            case 11:
//               System.out.println("nov");
//               break; 
//            case 12:
//               System.out.println("dec");
//               break; 
                                    
//           default:
//               System.out.println("Invalid Month");
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       for(int i=1; i<=10; i++){
//           System.out.println(i);
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       int i = 1;
//       while(i<=10){
//         System.out.println(i);
//         i++;
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//             int i = 1;
//       do{
//         System.out.println(i);
//         i++;
//       }while(i<=10);
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int sum = 0;
//       int n = 4;
//       for(int i = 0; i<=n; i++){
//         sum = sum + i;
//       }
//       System.out.println(sum);
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//     int sum = 0;
//     int n = 4;
//     int i = 0;
//     while(i<=n){
    
//       sum = sum + i;
//       i++;
//     }
//      System.out.println(sum);
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int sum = 0;
//   int n = 4;
//   int i = 0;
//   do{
//     sum = sum + i;
//     i++;
//   }
//   while(i<=n);
//   System.out.print(sum);
// }

//   }
  

// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();
//       for(int i=1; i<=10; i++){
//         System.out.println(n*i);
//       }
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n =  sc.nextInt();

//       for(int i=1; i<=n; i++){
//         if(i%2==0){
//            System.out.println(i);
//         }
       
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       for(;;){
//         System.out.println("Hello");
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


// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       int num;

//       do { 
//         System.out.println("Enter 1 enterd marks and 0 to exit");
//          num = sc.nextInt();

//          if(num == 1){
//           System.err.println("Enter the  marks out of 100");
//           int marks = sc.nextInt();

//           if (marks >= 90 && marks <= 100) {
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
          
//       } while (num != 0);{
//         System.out.println("stop program");
//       }
//   }
// }



// class Practise{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = sc.nextInt();

//       boolean isPrime  = true;

//       if(num <= 1){
//         isPrime = false;
//       } else{
//         for(int i=2; i * i<=num; i++){
//              if(num%i==0){
//               isPrime = false;
//               break;
//              }
//         }
//         if(isPrime){
//           System.out.println("Prime = " + num);
//         }else{
//           System.out.println("Not prime = "+ num);
//         }
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       int n = 4;
//       int m = 5;
      
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=m; j++){
//           System.out.print(" * ");
//         }
//         System.out.println();

//       }
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int n = 4;
//       int m = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=m; j++){
//           if(i == 1 || j == 1 || i == n || j== m){
//             System.out.print("*");
//           }else{
//             System.out.print(" ");
//           }
//         }
//         System.out.println();
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       int n = 4;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           System.out.print(" * ");
//         }
//         System.out.println();
//       }
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int n = 4;
//       for(int i=n; i>=1; i--){
//         for(int j=1; j<=i; j++){
//           System.out.print(" * ");
//         }
//         System.out.println();
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       int n  = 4;
//       for(int i = 1; i<=n; i++){
//         for(int j=1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//           System.out.println("");
//       }
    
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           System.out.print(j+" ");
//         }
//         System.out.println();
//       }
//   }
// }




// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=n; i>=1; i--){
//         for(int j=1; j<=i; j++){
//           System.out.print(j+" ");
//         }
//         System.out.println();
//       }
//   }
// }



// class Practise{
//   public static void main(String[] args) {
//       int num = 1;
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           System.out.print(num+ " ");
//           num++;
//         }
//         System.out.println();
//       }
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           int sum = i+j;
//           if(sum%2==0){
//             System.out.print("1 ");
//           }else{
//             System.out.print("0 ");
//           }
          
//         }
//         System.out.println();
//       }
//   }
// }



// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//         int space = 2 * (n-i);
//         for(int j=1; j<=space; j++){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//          System.out.println();
//       }




//         for(int i=n; i>=1; i--){
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//         int space = 2 * (n-i);
//         for(int j=1; j<=space; j++){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//          System.out.println();
//       }
     
//   }
// }




// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=5; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//   }
// }

// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//           System.out.print(i +" ");
//         }
//         System.out.println();
//       }
//   }
// }


// class Practise{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j = 1; j<=n-i; j++){
//           System.out.print("  ");
//         }
//         for(int j=i; j>=1; j--){
//           System.out.print(j + " ");
//         }
//         for(int j=2; j<=i; j++){
//           System.out.print(j + " ");
//         }
//         System.out.println();
//       }
//   }
// }



// class Practise{
//   public static void main(String[] args) {
//       int n = 4;
//       for(int i=1; i<=n; i++){
//         for( int j = 1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         for(int j=1;  j<=2*i-1; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }

//        for(int i=n; i>=1; i--){
//         for( int j = 1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         for(int j=1;  j<=2*i-1; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//   }
// }



// class Practise{
   
//     public static void printMyName(String name) {
//         System.out.println("Your name is: " + name);
//         return; 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = sc.nextLine(); 
//         printMyName(name);
      
//     }
// }


// class Practise{
//   public static int calculateSum(int a, int b){
//     int sum = a + b;
//     return sum;
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the value of a : ");
//       int a = sc.nextInt();
//        System.out.print("Enter the value of b : ");
//       int b = sc.nextInt();
//       int sum = calculateSum(a, b);
//       System.out.println("Sum = "+ sum);
      

//   }
// }


// class Practise{
//   public static int calculateProduct(int a, int b){
//     return a * b;

//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the value of a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the value of b : ");
//       int b = sc.nextInt();

//       System.out.println("The Product of = " + calculateProduct(a, b));
//   }
// }


// class Practise{
//   public static void printFactorial(int n){
//     if(n<0){
//       System.out.println("Invalid numer ");
//       return;
//     }
//     int factiorial = 1;
//     for(int i=n; i>=1; i--){
//       factiorial = factiorial *  i;
//     }
//     System.out.println("Factorial = "+ factiorial);
//     return;
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();

//       printFactorial(n);
//   }
// }



// class Practise{
//   public static void checkNumber(int n){
//     boolean isPrime = true;
//     if(n<=1){
//       isPrime = false;
//     }else{
//       for(int i=2; i*i<=n; i++){
//         if(n%i==0){
//           isPrime = false;
//           break;
//         }
//       }
//       if(isPrime){
//         System.out.print("Prime = " + n);
//       }else{
//         System.out.print("Not prime = " + n);
//       }
//     }
    
//   }
//   public static void main(String[] args) {
//       Scanner sc  = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();

//       checkNumber(n);

//   }
// }




// class Practise{
//   public static void checkNumber(int num){
//     if(num%2==0){
//       System.out.println("Even");
//     }
//     else{
//       System.out.println("odd");
//     }
    
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = sc.nextInt();

//       checkNumber(num);
//   }
// }

// class Practise{
//   public static void printTable(int n){
//     for(int i=1; i<=10; i++){
//       int sum = n * i;
//       System.out.println(sum);
//     }
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();

//       printTable(n);
//   }
// }





