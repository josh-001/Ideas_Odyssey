public class excetion_handling {
    public static void main(String[] args) {
        excetion_handling obj=new excetion_handling();
        obj.method1();
    }
    public void method1(){
        method2();
    }
    public void method2(){
        method3();
    }
    public void method3(){
        int x=5/0;
    }
}