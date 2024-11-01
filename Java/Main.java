
public class Main {
    public static void main(String[] args) {
        Boxweight box=new Boxweight();
        System.out.println(box.weight); 

        //Boxweight box1=new Box(3,6,7);  // boxweight is subclass of box(parent class) 
        Boxweight box2=new Boxweight(3,4,6,7);

        System.out.println(box2.l+"  "+box2.weight);

        

    }
}
