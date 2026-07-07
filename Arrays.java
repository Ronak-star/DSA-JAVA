
import java.util.Scanner;


//import java.util.Scanner;


//   public static void main(String[] args) {
//       int[] marks = new int[3];
//       marks[0] = 97;
//       marks[1] = 98;
//       marks[2] = 95;
//       // System.out.println(marks[0]);
//       // System.out.println(marks[1]);
//       // System.out.println(marks[2]);

//       for(int i=0; i<=2; i++){
//         System.out.println(marks[i]);
//       }
//   }
// }

// class Arrays{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the size of array : ");
//       int size = sc.nextInt();
//       int numbers[] = new int[size];

    // input
//       for(int i=0; i<size; i++){
//         numbers[i] = sc.nextInt();
//       }
        // output
//       for(int i=0; i<size; i++){
//         System.out.println(numbers[i]);
//       }
//   }
// }

// Q-> Take an array as input from the user. search for a given number x and print the index at which it occucrs.


// class Arrays{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the size of array : ");
//       int size = sc.nextInt();
//       int numbers[] = new int[size];

//       // input
//       System.out.print("Enter the value of array : ");
//       for(int i=0; i<size; i++){
//         numbers[i] = sc.nextInt();
//       }
//       System.out.print("Enter the search element : ");
//       int x = sc.nextInt();

//       // output
      
//       for(int i=0; i<numbers.length; i++){
      
//         if(numbers[i] == x){
//           System.out.println("x found at index : " + i);
//         }
//       }
//   }
// }


// class Arrays{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter number of rows : ");
//       int rows = sc.nextInt();
//       System.out.print("Enter number of cols : ");
//       int cols = sc.nextInt();

//       int [][] numbers = new int[rows][cols];

//       //input
//       // rows
//       for(int i=0; i<rows; i++){
//         //colums
//         for(int j=0; j<cols; j++){
//           numbers[i][j] = sc.nextInt();
//         }
//       }

//       // output
//       for(int i=0; i<rows; i++){
//         for(int j=0; j<cols; j++){
//           System.out.print(numbers[i][j] + " ");
//         }
//         System.out.println();
//       }
//   }
// }



// Take a matrix as input from the user. Search for a given numbers x and print the indices at which it occurs.



// class Arrays{
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter number of rows : ");
//       int rows = sc.nextInt();
//       System.out.print("Enter number of cols : ");
//       int cols = sc.nextInt();

//       int [][] numbers = new int[rows][cols];

//       //input
//       // rows
//       for(int i=0; i<rows; i++){
//         //colums
//         for(int j=0; j<cols; j++){
//           numbers[i][j] = sc.nextInt();
//         }
//       }

//   int x = sc.nextInt();

//   for(int i=0; i<rows; i++){
//     for(int j=0; j<cols; j++){
//       // compare with x
//       if(numbers[i][j] == x){
//         System.out.println("x found at location (" + i + ", " + j + ")");
//     }
//     }
//   }
//   }
// }
