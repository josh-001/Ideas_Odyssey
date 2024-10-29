import java.util.Scanner;

public class flow_control {
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=st.nextInt();
        if (number < 5){
            System.out.println(number + " is less than 5");
        }
        else if (number >5){
            System.out.println((number + " is greter than 5"));
        }
        else{
            System.out.println("Both are equal");
        }
    }
}