
// import java.util.Scanner;

// class Strings {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the name : ");
//       String name = sc.nextLine();
//       System.out.println("Your name is : " + name);
//   }
// }

// class Strings{
//   public static void main(String[] args) {
//     // concatenation
//       String firstName = "tony";
//       String lastName = "stark";
//       String fullName = firstName + " " + lastName;
//       System.out.println(fullName);
//       System.out.println(fullName.length());

//       // charAt
//       for(int i=0; i<fullName.length(); i++){
//         System.out.println(fullName.charAt(i));
//       }
//   }
// }

// class Strings{
//   public static void main(String[] args) {
//       // compare
//       String name1 = "Tony";
//       String name2 = "Tony";

//       // 1 s1 > s2 : +ve value
//       // 2 s1 == s2 : 0
//       // 3 s1 < s2 : -ve value

//       // if(name1.compareTo(name2) == 0){
//       //   System.out.println("Strings are equal");
//       // }else{
//       //   System.out.println("Strings are not equal");
//       // }

//       // if(name1 == name2){
//       //   System.out.println("Strings are equal");
//       // }else{
//       //   System.out.println("Strings are not equal");
//       // }


//       if(new String("Tony") == new String("Tony")){
//         System.out.println("String are equal");
//       } else{
//         System.out.println("String are not equal");
//       }

//   }
// }


// class Strings{
//   public static void main(String[] args) {
//       String sentence = "My name is Tony";
//       String name = sentence.substring(11, sentence.length());
//      System.out.println(name);
//   }
// }


// strings are Immutable


// string Builder

// class Strings{
//   public static void main(String[] args) {
//       StringBuilder sb = new StringBuilder("Tony");
//       System.out.println(sb);

//       // char at index 0 
//       System.out.println(sb.charAt(0));

//       // set char at index
//       sb.setCharAt(0, 'p');
//       System.out.println(sb);
//   }
// }

// class Strings{
//   public static void main(String[] args) {
//       StringBuilder sb = new StringBuilder("Tony");
//       System.out.println(sb);

//     //  sb.insert(0, 'S');
//     sb.insert(2, 'n');
//       System.out.println(sb);

//       // delete the extra 'n'
//       sb.delete(2, 4);
//       System.out.println(sb);

//   }
// }




// class Strings{
//   public static void main(String[] args) {
//       StringBuilder sb = new StringBuilder("h");
//       sb.append("e");
//       sb.append("l");
//       sb.append("l");
//       sb.append("o");
//       System.out.println(sb);
//       System.out.println(sb.length());

//   }
// }


// Reverse a string

// class Strings {
//   public static void main(String[] args) {
//       StringBuilder sb = new StringBuilder("hello");

//       for(int i=0; i<sb.length()/2; i++){
//         int front = i;
//         int back = sb.length() - 1 - i;

//         char frontChar = sb.charAt(front);
//         char backChar = sb.charAt(back);

//         sb.setCharAt(front, backChar);
//         sb.setCharAt(back, frontChar);
//       }
//       System.out.println(sb);
//   }
// }

