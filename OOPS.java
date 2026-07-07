// classes , objects, constructor, this key word,  

// class Pen{
//   String color;
//   String type;
   
//   public void write(){
//     System.out.println("writing something");
//   }
//   public void printColor(){
//     System.out.println(this.color);
//   }
// }

// class Student{
//   String name;
//   int age;

//     public void printInfo(){
//       System.out.println(this.name);
//       System.out.println(this.age);
//     }
//   // Student(){
//   //   System.out.println("Non paramitrised constructor called");
//   // }


//   // Student(String name, int age){
//   //      System.out.println("paramitrised constructor called");
//   //   this.name = name;
//   //   this.age = age;
//   // }


//   Student(Student s2){
//     System.out.println("copy constructor called");
//     this.name = s2.name;
//     this.age = s2.age;
//   }

//   Student(){

//   }
// }
// class OOPS{
//   public static void main(String[] args) {
//       // Pen pen1 = new Pen();
//       // pen1.color = "blue";
//       // pen1.type = "gel";

//       // Pen pen2 = new Pen();
//       // pen2.color = "black";
//       // pen2.type = "ballpaint";

//       // pen1.write();
//       // pen1.printColor();
//       // pen2.printColor();


//       Student s1 = new Student();
//    // Student s1 = new Student("aman", 24);
//       s1.name = "aman";
//       s1.age = 24;

//       Student s2 = new Student(s1);
//       s2.printInfo();

//      // s1.printInfo();
//   }
// }

// polymorphism
//1. compile time polymorphism -> function overloading 
//-> operator overloading

//2. Run time polymorpshim 
//-> function overriding


//1. compile time polymorphism -> function overloading 

// class Student{
//   String name;
//   int age;

//   public void printInfo(String name){
//     System.out.println(name);
//   }

  
//   public void printInfo(int age){
//     System.out.println(age);
//   }

  
//   public void printInfo(String name, int age){
//     System.out.println(name + " " + age);
//   }
// }

// class OOPS{
//   public static void main(String[] args) {
//       Student s1= new Student();
//       s1.name = "aman";
//       s1.age = 24;

//       s1.printInfo(s1.name, s1.age);
//   }
// }

// Inheritance

//1. single level inheritance
      // base class
      //    |
      //    |
      //    |
      // derived class

//2. Multi level inheritance
        // base class
        //     |
        //     |
        // derived class
        //     |
        //     |
        // derived class

//3. Hierarchial inheritance
        //    base class
        //    /     \
        //   /       \
        // derived   derived
        // class      class

//4. Hybrid inheritance - multiple inheritance added
  //     A
  //   /  \
  //  /    \
  // B      C
  // \     /
  //  \   / 
  //    D
// class Shape{
//   String color;
// }

// class Triangel extends Shape{

// }


// packages in java


// class OOPS{
//   public static void main(String[] args) {
//       Triangel t1 = new Triangel();
//       t1.color = "red";
//   }
// }
// import java.util.*;
// import bank.*;
// class Shape{
//   public void area(){
//     System.out.println("displays area : ");
//   }
// }

// class Triangel extends Shape{
//   public void area(int l, int h){
//     System.out.println(1/2*l*h);
//   }
// }

// class EquilateralTriangel extends Triangel{
//   public void area(int l, int h){
//     System.out.println(1/2*l*h);
//   }
// }


// class Circle extends Shape{
//   public void area(int r){
//     System.out.println((3.14)*r*r);
//   }
// }
// class OOPS{
//   public static void main(String[] args) {
//       bank.Account account1 = new bank.Account();
//       account1.name = "customer1";
//   }
// }


// Abstraction
// abstract class Animal{
//  abstract  public void walk();
//  Animal(){
//   System.out.println("You are creating a new Animal");
//  }
//  public void eat(){
//   System.out.println("Animal eats");
//  }
// }

// class Horse extends Animal{
//   Horse(){
//     System.out.println("Created a Horse");
//   }
//   public void walk(){
//     System.out.println("Walks on 4 legs");
//   }
// }
// class Chicken extends Animal{

//   public void walk(){
//     System.out.println("Walks on 2 legs");
//   }
// }
// public class OOPS{
//   public static void main(String[] args) {
//       Horse horse = new Horse();
//       horse.walk();
//       horse.eat();
//       Chicken chicken = new Chicken();
//       chicken.walk();
//       chicken.eat();
//   }
// }


// Interfaces -> multiple inheritance

// interface Animal{
//   int eyes = 2;
//    void walk();
  
// }
// interface Herbivore{
 
// }
// class Horse implements Animal, Herbivore{
//   public void walk(){
//     System.out.println("walks on 4 legs");
//   }
// }
// public class OOPS{
//   public static void main(String[] args) {
//       Horse horse = new Horse();
//       horse.walk();
//   }
// }


// class Student{
//   String name;
//   static String school;

//   public static void changeSchool(){
//     school = "newschoole";
//   }
// }

// public class OOPS{
//   public static void main(String[] args) {
//       Student.school = "Jab";
//       Student student1 = new Student();
//       student1.name = "monk";
//       System.out.println(student1.school);
//   }
// }