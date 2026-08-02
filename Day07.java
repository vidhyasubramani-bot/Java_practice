
// import  java.util.*;
// public class Day07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int original=a;
//         int rev=0;
//         while(a!=0){
//             int pop=a%10;
//             rev=rev*10+pop;
//             a/=10;
//         }
//         System.out.println(rev);
//        if(rev==original){
//         System.out.println("palindrome");
//        }
//        else{
//         System.out.println("not a palindrome");
//        }
        
//     }

    
// }



// Armstrong number.
// import  java.util.*;
// public class Day07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int original=a;
//         int temp=a;
//         int count=0;
//         int sum=0;
//         while(temp!=0){
//             temp/=10;
//             count++;
//         }
//         temp=a;
//         while(temp!=0){
//             int pop=temp%10;
//             sum+=Math.pow(pop,count);
//             temp/=10;

//         }
//         if(sum==original){
//             System.out.println("Armstrong number");
//         }
//         else{
//             System.out.println("Not a Armstrong number");
//         }
//         }

//     }



//Strong number.
// import java.util.*;
// public class Day07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int original=0;
//         int temp=a;
//         while(a!=0){
//             int pop=a%10;
//             int fact=1;
//             for(int i=1;i<=pop;i++){
//                 fact*=i;
               
                
//             }
        
//              original+=fact;
//                 a/=10;
//         }

//             System.out.println(original);
//             if(original==temp){
//                 System.out.println("Strong number");
//             }
//             else{
//                 System.out.println("not a Strong number");
//             }

        
//     }
// }


//Automorphic number.
  
// import java.util.*;
// public class Day07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int square=a*a;
//         int temp=a;
//         boolean isAutomorphic=true;
//         while(temp!=0){
           
//             if(square%10!=temp%10){
//                 isAutomorphic=false;
//                 break;
//                 }
//             square/=10;
//             temp/=10;
//         }
//         if(isAutomorphic){
//             System.out.println("Automorphic");
//         }
//             else{
//                 System.out.println("Not a Automorphic number");
                
//             }
//         }

//     }



// Neon number.
// import java.util.*;
// public class Day07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int org=a;
      
//         int square=a*a;
//         int sum=0;
//         while(square!=0){
//             int pop=square%10;
//             sum+=pop;
//             square/=10;
         

//         }
//         if(sum==org){
//             System.out.println("Neon number");
//         }
//         else{
//             System.out.println("Not a Neon number");
//         }
//     }
// }


// import java.util.*;
// public class Day07 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int sum=0;
//            for(int i=1;i<a;i++){
//            if(a%i==0){
//             sum+=i;

//            }

//            }
//            if(sum==a){
//             System.out.println("perfect number");
//            }
//            else{
//             System.out.println("not a perfect number");
//            }
           
//         }
//     }


// 



//Fibonacci series.
import java.util.*;
public class Day07 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
