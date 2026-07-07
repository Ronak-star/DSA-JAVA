
// class Functions_Methods{
   
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


// make a function to add 2 numbers and return the sum.

// class Functions_Methods{
//   public static int calculateSum(int a, int b){
//     int sum = a + b;
//     return sum;
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the Number of a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the Number of b : ");
//       int b = sc.nextInt();

//       int sum = calculateSum(a, b);
//       System.out.println("Sum : "+sum);
//   }
// }

// make a function to multiply 2 numbers and return the product

// class Functions_Methods{
//   public static int calculateProduct(int a, int b){
//     return a * b;
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the Number of a : ");
//       int a = sc.nextInt();
//       System.out.print("Enter the Number of b : ");
//       int b = sc.nextInt();

//       System.out.println("Product of  2 numbers is : "+ calculateProduct(a, b));
//   }
// }

// find the factiorial of a number

// class Functions_Methods{
//   public static void printFactorial(int n){
//     if(n < 0){
//       System.out.println("Invalid number");
//       return;
//     }
//     int factorial = 1;
//     //loop
//     for(int i=n; i>=1; i--){
//       factorial = factorial * i;
//     }
//     System.out.println("Factorial = " +factorial);
//     return;
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();

//       printFactorial(n);
//   }
// }


// Homework Problems 
// Make a function to check if a number is prime or not.

// class Functions_Methods{
//   public  static void primeNumber(int num){
//   boolean isPrime = true;

//   if(num <= 1){
//     isPrime = false;
//   } else{
//     for(int i=2; i * i <= num; i++){
//           if(num%i==0){
//             isPrime = false;
//             break;
//           }
//     }
//     if(isPrime){
//       System.out.println( "Prime number = " + num );
//     }else{
//       System.out.println( "Not prime number = " + num);
//     }
//   }


  
  
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number : ");
//       int num = sc.nextInt();

//       primeNumber(num);
      
//   }
// }
// Make a function to check if a given number n is even or not.


// class Functions_Methods{
//   public static void checkNumber(int num){
//     if(num % 2 == 0){
//       System.out.println("Even");
//     }
//     else{
//       System.out.println("Odd");
//     }

    
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int num = sc.nextInt();

//       checkNumber(num);
//   }
// }
// Make a function to print the table of a given number n.


// class Functions_Methods{
//   public static void printTable(int n){
//        for(int i=1; i<=10; i++){
//         int  num = n * i;
//         System.out.println(num);
//        }
//   }
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the number : ");
//       int n = sc.nextInt();

//       printTable(n);
//   }
// }
// Read about Recursion.


