        ////  for loop   //

public class flow_control {

    public static void main(String[] args){
        int sum=0;
        for (int i=1; i<=10;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum of all number: "+ sum);
    }
}


                //   Ternary Operator   //

// public class flow_control {

//     public static void main(String[] args){
//         Scanner inp=new Scanner(System.in);
//         System.out.println("enter the marks of the student : ");
//         double marks=inp.nextDouble();
//         String result=(marks>40) ? "pass" : "fail";

//         System.out.println("He "+result+" the exam");
//     }
// }


// import java.util.Scanner;

// public class flow_control {
//     public static void main(String[] args){
//         Scanner st=new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int number=st.nextInt();
//         if (number < 5){
//             System.out.println(number + " is less than 5");
//         }
//         else if (number >5){
//             System.out.println((number + " is greter than 5"));
//         }
//         else{
//             System.out.println("Both are equal");
//         }
//     }
// }