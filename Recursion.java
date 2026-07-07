
//import java.util.ArrayList;

// Qs -> print numbers from 5 to  1
// class Recursion{
// public static void printNumb(int n){
//   if(n==0){
//     return;
//   }
//   System.out.println(n);
//   printNumb(n-1);
// }

//   public static void main(String[] args) {
//       int n = 5;
//       printNumb(n);
//   }
// }

// Qs -> print numbers from 1 to  5

// class Recursion{
// public static void printNumb(int n){
//   if(n==6){
//     return ;
//   }
//   System.out.println(n);
//   printNumb(n+1);
// }

//   public static void main(String[] args) {
//       int n = 1;
//       printNumb(n);
//   }
// }

// Qs -> print sum of first n natural numbers

// class Recursion{
//   public static void printSum(int i, int n, int sum){
//     if(i == n){
//       sum += i;
//       System.out.println(sum);
//       return;
//     }
//     sum += i;
//     printSum(i+1, n, sum);
  // system.out.println(i);
//   }
//   public static void main(String[] args) {
//       printSum(1, 5, 0);
//   }
// }   

// Qs-> print factorial of a number n


// class Recursion{
//   public static int calcfactorial(int n){
//     if(n == 1 || n == 0){
//       return  1;

//     }
//     int fact_nm1 = calcfactorial(n-1);
//     int fact_n = n * fact_nm1;
//     return  fact_n;
//   }
//   public static void main(String[] args) {
//       int n = 5;
//       int ans = calcfactorial(n);
//       System.out.println(ans);
//   }
// }

// Qs -> print the fibonacci sequence till nth term

// class Recursion{
//   public static void printFib(int a, int b, int n){
//     if(n==0){
//       return;
//     }
//     int c = a + b;
//     System.out.print(c + " ");
//     printFib(b, c, n-1);
//   }
//   public static void main(String[] args) {
//       int a = 0, b = 1;
//       System.out.print(a+ " ");
//       System.out.print(b + " ");
//       int n = 7;
//       printFib(a, b, n-2);
//   }
// }


// Qs -> print x^n (stack height = n)

// class Recursion{
//   public static int calcPower(int x, int n){
//     if(n==0){ // base case 1
//       return  1;
//     }
//     if(x == 0){ // base case 2
//       return 0;
//     }
//     int xPownm1 = calcPower(x, n-1);
//     int xPownm = x * xPownm1;
//     return xPownm;
//   }
//   public static void main(String[] args) {
//       int x = 2, n = 5;
//       int ans = calcPower(x, n);
//       System.out.println(ans);
//   }
// }


// Qs -> print x^2 (stack height = logn)



// class Recursion{
//   public static int calcPower(int x, int n){
//     if(n == 0){ // base case 1
//       return 1;
//     }
//     if(x == 0){ // base case 2
//       return 0;
//     }
//     // if n is even
//     if(n%2 ==0){
//       return calcPower(x, n/2) * calcPower(x, n/2);
//     } else{ // n is odd
//       return calcPower(x, n/2) * calcPower(x, n/2) * x;
//     }

//   }
//   public static void main(String[] args) {
//        int x = 2, n = 5;
//       int ans = calcPower(x, n);
//       System.out.println(ans);
//   }
// }

// Recursion class 2

// Qs -> Tower of Hanoi
// class Recursion {

//     static int count = 1;

//     public static void towerofHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println(count + ". Transfer disk " + n +
//                                " from " + src + " to " + dest);
//             count++;
//             return;
//         }

//         towerofHanoi(n - 1, src, dest, helper);

//         System.out.println(count + ". Transfer disk " + n +
//                            " from " + src + " to " + dest);
//         count++;

//         towerofHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         towerofHanoi(n, "S", "H", "D");
//     }
// }


// Qs -> print a string in reverse

// class Recursion{
//   public static void printRev(String str, int idx){
//     if(idx == 0){
//       System.out.println(str.charAt(idx));
//       return;
//     }
//     System.out.print(str.charAt(idx));
//     printRev(str, idx-1);
//   }
//   public static void main(String[] args) {
//       String str = "abcd";
//       printRev(str, str.length()-1);
//   }
// }


// Qs -> find the 1st & last occurance of an element in string

// class Recursion{
//   public static int first = -1;
//   public static int last = -1;

//   public static void findOccurancce(String str, int idx, char element)
//   {
//       if(idx == str.length()){
//      System.out.println(first);
//      System.out.println(last);
//      return;
//       }
//     char currChar = str.charAt(idx);
//     if(currChar == element){
//       if(first == -1){
//         first = idx;
//       } else{
//         last = idx;
//       }
//     }
//     findOccurancce(str, idx+1, element);
//   }
//   public static void main(String[] args) {
//       String str = "abaacdaefaah";
//       findOccurancce(str, 0, 'a');
//   }

// }


// Qs -> check if an array is sorted strictly increasing

// class Recursion{
//   public static boolean isSorted(int arr[], int idx){
//     if(idx == arr.length-1){
//       return true;
//     }
//     if(arr[idx] >= arr[idx+1]){
//       // array is unsorted till now
//       return false;
//     } 
//     return isSorted(arr, idx+1);

//   }
//   public static void main(String[] args) {
//       int arr[] = {1,2,3,3,5};
//       System.out.println(isSorted(arr, 0));
//   }
// }

// Qs -> move all 'X' to the end of the string

// class Recursion{
//   public static void moveAllX(String str, int idx, int count, String newString){
//     if(idx == str.length()){
//       for(int i=0; i<count; i++){
//         newString += 'x';
//       }
//       System.out.println(newString);
//       return;
//     }
//     char currChar = str.charAt(idx);
//     if(currChar == 'x'){
//       count++;
//       moveAllX(str, idx+1, count, newString);
//     }else{
//       newString += currChar;
//       moveAllX(str, idx+1, count, newString); // newstring = newstring + currChar
//     }
//   }
//   public static void main(String[] args) {
//    String str = "axbcxxd";
//    moveAllX(str, 0, 0, "");   
//   }
// }


// Qs -> Romove duplicates in a string

// class Recursion{
//   public static boolean[] map = new boolean[25];

//   public static void removeDuplicates(String str, int idx, String newString){
//     if(idx == str.length()){
//       System.out.println(newString);
//       return;
//     }
//     char currChar = str.charAt(idx);
//     if(map[currChar - 'a']){
//       removeDuplicates(str, idx+1, newString);
//     }else{
//       newString += currChar;
//       map[currChar - 'a'] = true;
//       removeDuplicates(str, idx+1, newString);
//     }
//   }
//   public static void main(String[] args) {
//       String str = "abbccda";
//       removeDuplicates(str, 0, "");
//   }
// }

// Qs -> print all the subsequences of a string
 // Important for placement
// class Recursion{
//   public static void subsequences(String str, int idx, String newString){
//     if(idx == str.length()){
//       System.out.println(newString);
//       return;
//     }
//     char currChar = str.charAt(idx);

//     // to be
//     subsequences(str, idx+1, newString+currChar);

//     // or not to be
//     subsequences(str, idx+1, newString);
//   }
//   public static void main(String[] args) {
//       String str = "abc";
//       subsequences(str, 0, "");
//   }
// }


// Qs -> print all the unique sebsequences of a string



// class Recursion{
//   public static void subsequences(String str, int idx, String newString, HashSet<String>set){
//     if(idx == str.length()){
//       if(set.contains(newString)){
//         return;
//       }else{
//         System.out.println(newString);
//         set.add(newString);
//         return;
//       }
      
//     }
//     char currChar = str.charAt(idx);

//     // to be
//     subsequences(str, idx+1, newString+currChar, set);

//     // or not to be
//     subsequences(str, idx+1, newString,set);
//   }
//   public static void main(String[] args) {
//       String str = "aaa";
//       HashSet<String> set = new HashSet<>();
//       subsequences(str, 0, "", set);
//   }
// }


// Qs -> print keypad combination

// class Recursion{
//   public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//   public static void printComb(String str, int idx, String combination){
//    if(idx == str.length()){
//     System.out.println(combination);
//     return;
//    }
//     char currChar = str.charAt(idx);
//     String mapping = keypad[currChar - '0'];

//     for(int i=0; i<mapping.length(); i++){
//       printComb(str, idx+1, combination+mapping.charAt(i));
//     }
//   }
//   public static void main(String[] args) {
//       String str = "23";
//       printComb(str, 0, "");
//   }
// }

// Qs -> print all permutation of a string

// class Recursion{
//   public static void printPerm(String str, String permutation){
//     if(str.length() == 0){
//          System.out.println(permutation);
//     }

//     for (int i=0; i<str.length(); i++) {
//       char currChar = str.charAt(i);
//       String newStr = str.substring(0, i) + str.substring(i+1);
//       printPerm(newStr, permutation+currChar);
        
//     }
//   }
//   public static void main(String[] args) {
//       String str = "abc";
//       printPerm(str, "");
//   }
// }


// Qs -> count total paths in maze to move from (0,0) to (n,m)

// class Recursion{
//   public static int countPaths (int i, int j, int n, int m){
//     if(i == n || j == m){
//          return 0;
//     }
//     if(i == n-1 && j == m-1){
//       return 1;
//     }
//     // move downwards
//     int downwards = countPaths(i+1, j, n, m);

//     // move right
//     int rightPaths = countPaths(i, j+1, n, m);

//     return downwards + rightPaths;
//   }
//   public static void main(String[] args) {
//       int n = 3, m = 3;
 
//      int totalPaths =  countPaths(0, 0, n, m);
//      System.out.println(totalPaths);


//   }
// }


// Qs -> place Tiles fo size  1*m in a floor of size n*m

// class Recursion{
//   public static int placeTiles(int n, int m){
//     if(n == m){
//       return 2;
//     }
//     if(n<m){
//       return 1;
//     }
//     // vertically

//     int vertPlacements = placeTiles(n-m, m);

//     // horizontally
//     int horPlacements = placeTiles(n-1, m);

//     return vertPlacements + horPlacements;
//    }
//    public static void main(String[] args) {
//        int n = 4, m = 2;
//        System.out.println(placeTiles(n, m));
//    }

// }




// Qs -> find the number of ways in which you can invite n people to your party, single or in pairs

// class Recursion{
//   public static int callGuests(int n){
//     if(n <= 1){
//       return 1;
//     }
//     // single
//     int ways1 = callGuests(n-1);

//     //pair
//     int wasy2= (n-1) * callGuests(n-2);

//     return ways1 + wasy2;


//   }
//   public static void main(String[] args) {
//       int n = 4;
//       System.out.println(callGuests(n));
//   }
// }


// class Recursion{
//   public static void printSubset(ArrayList<Integer> subset){
//     for(int i=-0; i<subset.size(); i++){
//       System.out.print(subset.get(i)+" ");

//     }
//     System.out.println();
//   }
//   public static void findSubsets(int n, ArrayList<Integer> subset){
//     if(n == 0){
//       printSubset(subset);
//       return;
//     }
//     // add hoga
//     subset.add(n);
//     findSubsets(n-1, subset);

//     //add nhi hoga
//     subset.remove(subset.size()-1);
//     findSubsets(n-1, subset);
//   }
//   public static void main(String[] args) {
//       int n = 3;
//       ArrayList<Integer> subset = new ArrayList<>();
//       findSubsets(n, subset);
//   }
// }





  