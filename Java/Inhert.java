class Ingerit {
    double salary;
    double age;
    String name;

    Ingerit(){
        this.salary=30000;
        this.age=23;
        this.name="random_name";
    }
    Ingerit(double salary,double age,String name){
        this.salary=salary;
        this.age=age;
        this.name=name;
    }
}

class Single_Inherit extends Ingerit{
    String dept;

    Single_Inherit(){
        this.dept="HR";
    }
    // Single_Inherit(double salary,double age,String name){
    //     super(salary,age,name);
    // }
    Single_Inherit(double salary,double age,String name,String dept){
        // by commenting supermethod it is taking default properties which we assigned ,
        super(salary,age,name);
        
        this.dept=dept;
    }
}
class mutlilevel_inherit extends Single_Inherit{
    int number;
    mutlilevel_inherit(){
        this.number=8;
    }
    mutlilevel_inherit(double salary,double age,String name,String dept,int number){
        super(salary,age,name,dept);
        this.number=number;

    }
}
class Inhert{

    //Error: Main method not found in class Ingerit, please define the main method as:
   //public static void main(String[] args)
  // or a JavaFX application class must extend javafx.application.Application
    public static void main(String[] args) {
        // SINGLE INHERITANCE //
        // Single_Inherit  e1=new Single_Inherit(20000, 36, "e1", "IT");
        // System.out.println(e1.salary+" "+e1.age+" "+e1.name+" "+e1.dept);

        //   Multi - level Inhergitance
        mutlilevel_inherit e2=new mutlilevel_inherit(20000, 36, "wrfd1", "IT",20);
        System.out.println(e2.name);
    }    
}


