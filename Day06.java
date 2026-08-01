
// Print even numbers.

// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=0;i<a;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }

// }


// Print odd numbers.

// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=0;i<a;i++){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
//         }
//     }

// }

// Find the sum of first N numbers.
// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int sum=0;
//         for(int i=0;i<a;i++){
//             sum+=i;
            
//                 System.out.println(sum);
            
//         }
//     }

// }

//  Find the factorial.
// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=a;i++){
//             fact*=i;
            

            
//         }
//           System.out.println(fact);
//     }

// }

//  Reverse a number.
// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int rev=0;
//         while(a>0){
//             rev=rev*10+a%10;
//             a/=10;
//         }
//         System.out.println(rev);
//     }
// }




//  Sum of digits.


// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int sum=0;
// while(a!=0){
//     int pop=a%10;
//     sum+=pop;
//     a/=10;
// }
//         System.out.println(sum);
//     }
// }

// Count digits.


// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int sum=0;
// while(a!=0){
//     int pop=a%10;
//     sum+=1;
//     a/=10;
// }
//         System.out.println(sum);
//     }
// }



//Product of digits.


// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int prod=1;
// while(a!=0){
//     int pop=a%10;
//     prod*=pop;
//     a/=10;
// }
//         System.out.println(prod);
//     }
// }


//First and last digit sum.


// import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int first=0;
//         int last=a%10;
// while(a>0){
  
//     if(a<10){
//         first=a;
         
//     }
//     a/=10;
    
   
// }
 
//         System.out.println(first+last);
//     }
// }


//Largest digit.

//  import java.util.*;
// public class Day06{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int large=0;
//         while(a!=0){
//             int pop=a%10;
//             if(pop>large){
//                 large=pop;
                
//             }
//             a/=10;
           
            

//         }
//          System.out.println(large);
//     }
// }



// Smallest digit

 import java.util.*;
public class Day06{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int small=9;
        while(a!=0){
            int pop=a%10;
            if(pop<small){
                small=pop;
            }
            a/=10;
        }
        System.out.println(small);
    }

}
        