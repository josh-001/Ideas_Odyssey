        ////       Protected Access Modifier      ////


class Animal{
    protected void display(){
        System.out.println("protected funtion");
    }
}

class Modifiers extends Animal{
    public static void main(String[] args){
        Modifiers mod=new Modifiers();
        mod.display();
    }
}


//  // private class
// class Data {
//     // private variable
//     private String name;
// }

// public class Modifiers {
//     public static void main(String[] main){

//         // create an object of Data
//         Data d = new Data();

//         // access private variable and field from another class
//         d.name = "Programiz";
//     }
// }



//              use the getters and setters method     //


// class Data{
//     private String name;
    

//     // public Data(){
//     //     this.name="assiged in privateclass";
//     // }
//     // public void printName() {
//     //     System.out.println("Name: " + name);
//     // }

//     // getter method
//     public String getNae(){              // no need to getName can keep anything but should match
//         return this.name;
//     }
//     // setter method
//     public void setNae(String name) {   // no need to setName can keep anything but should match
//         this.name= name;
//     }
// }
// public class Modifiers {

//     public static void main(String[] args){
//         Data d = new Data();
//         // d.printName();

//         d.setNae("yes-its a name");
//         System.out.println(d.getNae());
//     }
// }


