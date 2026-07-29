//1.Print "Hello, World!"

//public class Day01 {
//     public static void main(String []args){
//         System.out.println("Hello, World");
//     }
//      }




// 2.Print your name, age, and department.

// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter your name:");
//     String name=sc.nextLine();
//     System.out.println("enter your age:");
//     int age=sc.nextInt();
//     System.out.println("enter your dep:");
//     sc.nextLine();
//     String dep=sc.nextLine();
//     System.out.println("name:"+name);
//     System.out.println("age:"+age);
//     System.out.println("dep:"+dep);
//     }
// }




//3.Add two numbers.


// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a number:");
//         int a=input.nextInt();
//         System.out.println("enter  a number:");
//         int b=input.nextInt();
//         System.out.println("addition of two numbers:"+ (a+b));

//     }
// }


//5.Find the area of a rectangle.
// import java.util.*;
//  public class Day01{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a number:");
//         int a=input.nextInt();
//         System.out.println("enter  a number:");
//         int b=input.nextInt();
//         System.out.println("addition of two numbers:"+ (a*b));
//     }
//  }


//Find the area of a circle.
// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter your radius:");
//         int r=input.nextInt();
//         System.out.println("the area of the circle:"+(22/7)*r*r);
//     }
// }



// Swap two numbers (using third variable).
// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your number:");
//         int num1=sc.nextInt();
//         System.out.println("enter your number:");
//         int num2=sc.nextInt();
//         int temp=num1;
//         num1=num2;
//         num2=temp;
//         System.out.println("swapping number is:"+num1+" "+num2);
        
//     }
    
// }

//Swap two numbers (without third variable).
// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your number:");
//         int a=sc.nextInt();
//         System.out.println("enter your number:");
//         int b=sc.nextInt();
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("after swap:"+a+ " "+b);
//     }
// }

//8.Convert Celsius to Fahrenheit.
// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your celsius:");
//         double a=sc.nextInt();
//         double c=((9/5*c)+32);
//         System.out.println(c);
//     }
// }


//Find the square and cube of a number.
// import java.util.*;
// public class Day01{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your celsius:");
//         int a=sc.nextInt();
//         int square=a*a;
//         int cube=a*a*a;
//         System.out.println("square:"+square);
//         System.out.println("cube:"+cube);

//     }
// }

//Check whether a number is even or odd.
import java.util.*;
public class Day01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int a=sc.nextInt();
       
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}