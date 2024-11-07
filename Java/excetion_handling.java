

        //  CHECKED exception
public class excetion_handling{
        public static void main(String[] args){
                int i = 0;
                while (i < 5) {  // Change the condition to i < 5
                try {
                        System.out.println("i = " + i);
                        i++;
                } finally {
                        System.out.println("Inside finally block, i = " + i);
                } 
                }
        }
}
        //    UNCHECKED EXCEPTION   //

// public class excetion_handling{
//     public static void main(String[] args){

//         int val3=Integer.parseInt("abc");  //java.lang.NumberFormatException: For input string: "abc"
//         String val2=null;
//         System.out.println(val2.charAt(0)); //java.lang.NullPointerException
//         String val="Hello";
//         System.out.println(val.charAt(5));//String index out of range: 5
//         int[] val1=new int[2];
//         System.out.println(val1[3]);  //Index 3 out of bounds for length 2(AARRAY)
//     }
// }

//             // ClassCast  Exception
// public class excetion_handling {
//     public static void main(String[] args){
//         Object val=0;
//         System.out.println((String)val);//class java.lang.Integer cannot be cast to class java.lang.String
//     }
// }

            //  RUNTIME EXCEPTIONS  ----which occurs during runtime andcompiler not forcing to handle them
// public class excetion_handling {
//     public static void main(String[] args) {
//         method1();
//     }
//     public static void method1(){
//         throw new ArithmeticException();
//     }
// }



       //  Arthemetic HANDING  
// public class excetion_handling {
//     public static void main(String[] args) {
//         excetion_handling obj=new excetion_handling();
//         obj.method1();
//     }
//     public void method1(){
//         method2();
//     }
//     public void method2(){
//         method3();
//     }
//     public void method3(){
//         int x=5/0;
//     }
// }



// public class excetion_handling {

//     public static void main(String[] args) {
//         String[] a= new String[90000000*920000*90000];   //Comes under Error 
//     }
// }