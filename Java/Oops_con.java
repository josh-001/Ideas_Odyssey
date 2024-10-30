

public class Oops_con {
    public static void main(String[] args){
        Student s1=new Student();

        // can assign here itself rollno,name,marks 

        s1.rollno=30;


        s1.greting();
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        // System.out.println(s1.x);
       // System.out.println(s1.sub);  // sub is not exist in student class  


       Student s2= new Student(65,"s2name",41.5f);
       System.out.println(s2.rollno);

       Student s3=new Student(s1);
       System.out.println(s3.marks);
    }    
}

class Student{

    int rollno=220;
    String name;
    float marks;
    // boolean x;

    ///  
    void greting(){
        System.out.println("Hey my name is "+ name);
    }

    Student(){
        this.rollno=60;
        this.name="s1name";
        this.marks=30f;
        // this.x=false;
    }

    Student(int roll, String namer,float mark){
        this.rollno=roll;
        this.name=namer;
        this.marks=mark;
    }


    Student (Student other){     
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks=other.marks;
    }

}