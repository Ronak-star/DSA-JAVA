// Print the pattern solid rectangel
// * * * * * 
// * * * * *
// * * * * *
// * * * * * 

// class Patterns{
//   public static void main(String[] args) {
//     int n = 4;
//     int m = 5;

//     //Outer loop
//       for(int i=1; i<=n; i++){
//         // inner loop
//         for(int j=1; j<=m; j++){
//           System.out.print(" * ");
//         }
//           System.out.println();
//       }
    
//   }
// }


// Print the pattern Hollw rectangel
// * * * * * 
// *       *
// *       *
// * * * * * 

// class Patterns{
//   public static void main(String[] args) {
//       int n = 4;
//       int m = 5;
//       // outer loop
//       for(int i=1; i<=n; i++){
//         // inner loop
//         for(int j=1; j<=m; j++){
//           // cell -> {i, j}
//           if(i == 1 || j == 1 || i == n || j == m){
//             System.out.print("*");
//           }else{
//          System.out.print(" ");

//         }
//       }
//       System.out.println();
//       }
      
//   }
// }


// print the pattern half pyramid

// *
// * *
// * * * 
// * * * * 

// class Patterns{
//   public static void main(String[] args) {
//       int n = 4;

//       // outer loop
//       for(int i = 1; i<=n; i++){
//         // inner loop
//         for(int j=1; j<=i; j++){
//             System.out.print(" * ");
//         }
//          System.out.println();
//       }
     
//   }
// }



//print the pattern inverted half pyramid

// * * * * 
// * * *
// * * 
// *

// class Patterns{
//   public static void main(String[] args) {
//       int n = 4;

//       // outer loop
//       for(int i = n; i>=1; i--){
//         // inner loop
//         for(int j=1; j<=i; j++){
//             System.out.print(" * ");
//         }
//          System.out.println();
//       }
     
//   }
// }



// print the pattern inverted half pyramid(rotated by 180 deg)

//          *
//       *  *
//    *  *  *
// *  *  *  *


// class Patterns{
//   public static void main(String[] args) {
//       int n = 4;

//       // outer loop
//       for(int i = 1; i<=n; i++){
//         // inner loop -> space print
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         // inner loop -> star print
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//         System.out.println("");
//       }
     
//   }
// }


// print the pattern Half pyramid with numbers
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


// class Patterns{
//   public static void main(String[] args) {
//       int n=5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           System.err.print(j + " ");
//         }
//         System.out.println();
//       }
//   }
// }


// print the pattern inverted Half pyramid with numbers
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1 


// class Patterns{
//   public static void main(String[] args) {
//       int n=5;
//       for(int i=n; i>=1; i--){
//         for(int j=1; j<=i; j++){
//           System.err.print(j + " ");
//         }
//         System.out.println();
//       }
//   }
// }

// print the patter Floyd's Triange
// 1 
// 2 3
// 4 5 6
// 7 8 9 10 
// 11 12 13 14 15


// class Patterns{
//   public static void main(String[] args) {
//     int num = 1;
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           System.out.print(num + " ");
//           num++;
//         }
//         System.out.println();
//       }
//   }
// }

// print the pattern 0-1 Triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// class Patterns{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//           int sum = i+j;
//           if(sum % 2 == 0){ // even
//             System.out.print("1 ");
//           }
//           else{ // odd
//             System.out.print("0 ");
//           }
//         }
//         System.out.println();
//       }
//   }
// }




// Lecture 5 --> Advanced Pattern Questions Java

// print the pattern Butterfly pattern
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

// class Patterns{
//   public static void main(String[] args) {
//       int n = 5;
   
//       // upper half
//       for(int i=1; i<=n; i++){
//         // 1st part
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }

//         // spaces
//         int spaces = 2 * (n-i);
//         for(int j=1; j<=spaces; j++){
//           System.out.print(" ");
//         }
//         // 2nd part
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }



//        // lower half
//       for(int i=n; i>=1; i--){
//         // 1st part
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }

//         // spaces
//         int spaces = 2 * (n-i);
//         for(int j=1; j<=spaces; j++){
//           System.out.print(" ");
//         }
//         // 2nd part
//         for(int j=1; j<=i; j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//   }
// }


// Print a solid rhombus. 
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * * 
// * * * * * 


// class Patterns{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//         // spaces
//         for(int j=1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         // stars
//         for(int j=1; j<=5; j++){
//           System.out.print("*");
//         }
//         System.out.println();
        
//       }
//   }
// }

// print the pattern Number Pyramid
//         1
//       2   2
//     3   3   3
//   4   4   4   4
// 5   5   5   5   5

// class Patterns{
//   public static void main(String[] args) {
//       int n=5;
//       for(int i=1; i<=n; i++){
//         // spaces
//         for(int j=1; j<=n-i; j++){
//           System.out.print(" ");
//         }
//         // numbers -> print row no, row no times
//         for(int j=1; j<=i; j++){
//           System.out.print(i + " ");
//         }
//         System.out.println();
//       }
//   }
// }

// print the pattern palindromic pattern

//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 1 2 4 5

// class Patterns{
//   public static void main(String[] args) {
//       int n = 5;
//       for(int i=1; i<=n; i++){
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//            // 1st half numbers
//            for (int j = i; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//            // 2nd half numbers
//         for (int j = 2; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//            System.out.println();
//       }


//   }
// }

// print the pattern Diamond pattern

  //         *
  //       * * *
  //     * * * * *
  //   * * * * * * *
  // * * * * * * * * *
  //   * * * * * * *
  //     * * * * *
  //       * * *
  //         *


// class Patterns{
//   public static void main(String[] args) {
//       int n = 4;
//       // upper half
//       for(int i=1; i<=n; i++){
//        // spaces
//        for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//        }
//        // stars
//        for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//        }
//        System.out.println();
//       }
      
      

//       // lower half

//       for(int i=n; i>=1; i--){
//        // spaces
//        for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//        }
//        // stars
//        for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//        }
//        System.out.println();
//       }
      
//   }
// }


 