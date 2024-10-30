public class Main {
    // statuic belong to class not to object
    public static void main(String[] args) {
        Human h1=new Human(22,"s1",10000,false);
        System.out.println(h1.populationb);

        Human h2=new Human(27,"s2",250000,true);
        // static variable doesnt depend on objects 
        //we canb use static variables wohtoput creating objhects 
        System.out.println(h2.populationb);

        yes_me();
    }
 
    // inside the static we cant call which is not static methoid like
    void greeting(){
        System.out.println("hio");
          // non static can be called and static but static cant access a nion static funtion
    }  

    // something which is not stat ic belong to object
    static void yes_me(){
        //greeting();  //  erro r: non-static method greeting() cannot be referenced from a static context

        Main obj=new Main();
        obj.greeting();   
        System.out.println("hey yah");
    }
}
