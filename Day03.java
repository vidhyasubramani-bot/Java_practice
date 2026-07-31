//1.Find the grade based on marks.


// import java.util.*;
// public class Day03 {
//  //Find the grade based on marks.
//  public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     int num=sc.nextInt();
//     if(num>90){
//         System.out.println("A+");
//     }
//     else if(num>80){
//         System.out.println("A");
//     }
//     else if(num>70){
//         System.out.println("B+");
//     }
//     else if(num>60){
//         System.out.println("B");
//     }
//     else if(num>50){
//         System.out.println("C");
//     }
//     else{
//         System.out.println("Fail");
//     }
   

//  }


    
// }



//2.Check whether a number is positive, negative, or zero.


// import java.util.*;
//     public class Day03{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int num=sc.nextInt();
//             if(num>0){
//                 System.out.println("Positive");
//             }
//             else if(num==0){
//                 System.out.println("Zero");
//             }
//             else{
//                 System.out.println("negative");
//             }
            
    //     }
    // }


   //3. Check whether a number is divisible by 5 and 11.
//    import java.util.*;
//    public class Day03{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num%5==0 && num%11==0){
//             System.out.println("Divisible by 5 and 11");
//         }
//         else{
//             System.out.println("Not Divisible by 5 &11");
//         }
//     }
    
//    }



//Simple Calculator using switch
// import java.util.*;
//    public class Day03{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          System.out.println("enter first value");
//         int num1=sc.nextInt();
//         System.out.println("enter first value");
//         int num2=sc.nextInt();
//         System.out.println("enter your operator(+,-,/,*):");
//         char op=sc.next().charAt(0);
//         switch (op) {
//             case '+':
//                 System.out.println(num1+num2);
                
//                 break;
//                 case '-':
//                     System.out.println(num1-num2);
//                     break;
//             case '*':
//                 System.out.println(num1*num2);
//                 break;
//                 case '/':
//                     System.out.println(num1/num2);
//                     break;

        
//             default:
//                 System.out.println("invalid operator");
//                 break;
//         }
//     }
// }



//Display Month Name

import java.util.*;
   public class Day03{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter first month:");
        int num1=sc.nextInt();

        switch (num1) {
            
                case 1:
                System.out.println("january");
                
                break;
                case 2:
                System.out.println("febuary");
                
                break;
                case 3:
                System.out.println("march");
                
                break;
                case 4:
                System.out.println("April");
                
                break;
                case 5:
                System.out.println("May");
                
                break;
                
                case 6:
                System.out.println("June");
                
                break;
                case 7:
                System.out.println("july");
                
                break;
                 case 8:
                System.out.println("Augest");
                
                break;
                 case 9:
                System.out.println("September");
                
                break;
                 case 10:
                System.out.println("October");
                
                break;
                 case 11:
                System.out.println("November");
                
                break;
                 case 12:
                System.out.println("December");
                
                break;
        
            default:
                System.out.println("invalid number");
                break;
        }
    }
}
