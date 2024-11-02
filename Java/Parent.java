            //   ABSTRACT CLASSES   //

// abstract class Parents{
//     int age;
//     Parents(){
//         System.out.println("age is diff");
//     }
    
//     abstract void career();
//     void partner(){
//         System.out.println("I am partener from parent class");
//     }
// }

// class Son extends Parents{
    
//     Son(int age){
//         // super(age);

//     }
//     void career(){
//         System.out.println("I want to become Engineer");
//     }
//     void partner(){
//         System.out.println("I will make a patner at age 27");
//     } 
// }

// class Daughter extends Parents{

//     Daughter(int age){
//         // super(age);
//     }
//     void career(){
//         System.out.println("I want to become fashon designeer");
//     }
//     void partner(){
//         System.out.println("I willmake a parner at age 24");
//     } 
// }

// public class Parent{
//     public static void main(String[] args) {
//         Son s=new Son(34);

//         // Each time you create an instance of Son or Daughter,
//         //  the Parents constructor is called first, printing "age is diff"
//         //   before the specific behavior (like career())

//         s.career();

//         Parents y=new Son(25);
//         y.career();

//         Daughter d = new Daughter(21);
//         d.career();

//         // Parents p=new Parents(); // cant call an instance ofparents 

//     }
// }

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
    // int price=100000;
    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    int price=100000;
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Parent {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        System.out.println(myDog.price);
        myDog.sound();
        myDog.sleep();

        myCat.sound();
        myCat.sleep();
    }
}



                    //  NORMAL //
// class Parents{
//     void career(){
//         System.out.println("I am prtintg fromparent class not child");
//     }
//     void partner(){
//         System.out.println("I am partener from parent class");
//     }
// }

// class Son extends Parents{
//     void career(){
//         System.out.println("I want to become Engineer");
//     }
//     void partner(){
//         System.out.println("I will make a patner at age 27");
//     } 
// }

// class Daughter extends Parents{
//     void career(){
//         System.out.println("I want to become fashon designeer");
//     }
//     void partner(){
//         System.out.println("I willmake a parner at age 24");
//     } 
// }

// public class Parent{
//     public static void main(String[] args) {
//         Son s=new Son();
//         s.career();

//         Parents y=new Son();
//         y.career();

//         Daughter d = new Daughter();
//         d.career();
//     }
// }