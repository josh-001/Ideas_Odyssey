
 // private class
class Data {
    // private variable
    private String name;
}

public class Modifiers {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";
    }
}