public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long populationb;

    public Human(int age, String name, int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.populationb +=1;
    }
}
