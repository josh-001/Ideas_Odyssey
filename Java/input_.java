import java.util.Scanner;

public class input_ {
    public static void main(String[] args){
            // create an object of Scanner
    Scanner input = new Scanner(System.in);
    // take input from the user
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    System.out.println("number entered is :"+number);
    input.close();
    }

}