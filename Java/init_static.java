
public class init_static {  //  error: modifier static not allowed here
    static int a=4;
    static int b;

    static{
        System.out.println(" HEY i will  run only once irrespetive of number of objects created");
        b= a*5;
    }
    public static void main(String[] args) {
        init_static obj= new init_static();
        System.out.println(init_static.a+"  "+init_static.b);
        init_static.b += 5;
        init_static obj1=new init_static();
        System.out.println(init_static.a+"  "+init_static.b);
    }
}
