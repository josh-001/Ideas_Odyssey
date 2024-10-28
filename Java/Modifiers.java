
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


class Data{
    private String name;
    
    // getter method
    public String getName(){
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Modifiers {

    public static void main(String[] args){
        Data d = new Data();

        d.setName("yes-its a name");
        System.out.println(d.getName());
    }
}