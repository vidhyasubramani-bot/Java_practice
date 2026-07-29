// //1. largest of two number

// import java.util.*;
// public class Day02 {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);

//         System.out.println("enter your number:");
//         int a=input.nextInt();
//         System.out.println("enter your number:");
//         int b=input.nextInt();
//         if(a>b){
//             System.out.println("a is the largest number");
//         }
//         else{
//             System.out.println("b is the largest number");
//         }
        
//     }
    
// }


//2.Check whether a year is a leap year.
// import java.util.*;
// public class Day02 {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);

//         System.out.println("enter your year:");
//         int a=input.nextInt();
//         if((a%400==0)||(a%4==0&&a%100!=0)){
//             System.out.println("leaf year");
//         }
//         else{
//             System.out.println("not a leap year");
//         }
//     }
// }

// import java.util.*;
// public class Day02 {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);

//         System.out.println("enter your char:");
//         char a=input.next().charAt(0);
//         int ch=(int)a;
//         System.out.println(ch);

//     }
// }

// import java.util.*;
// public class Day02 {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a string:");
//         char name=input.next().charAt(0);
//         if(name>='A'&& name<='Z'){
//             System.out.println("the given char is uppercase");


//         }
//         else if(name>='a'&&name<='z'){
//         System.out.println("lowercase");
//         }
//         else{
//             System.out.println("not a alphabet");
//         }

//     }
// }


import java.util.*;
public class Day02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter marks:");
        int tamil=input.nextInt();
        System.out.println("enter your marks:");
        int english =input.nextInt();
        System.out.println("enter your marks:");
        int maths=input.nextInt();
        System.out.println("enter your marks");
        int science=input.nextInt();
        System.out.println("enter your marks:");
        int social =input.nextInt();
        int total=tamil+english+maths+science+social;
        double average=total/5;
        System.out.println(average);



    }
}




