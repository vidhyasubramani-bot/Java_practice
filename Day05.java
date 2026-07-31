// import java.util.*;
// public class Day05 {public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if (ch>='A'&&ch<='Z'&&ch>='a'&&ch<='z') {
//             System.out.println("alphabet");
            
//         }
//         else if(ch>='0'&&ch>='9'){
//             System.out.println("digits");
//         }
//         else{
//             System.out.println("special ");
//         }
//     }


    
// }
//2.ATM Menu Simulation
// import java.util.*;
// public class Day05{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("1.Balance");
//         System.out.println("2.Deposit");
//         System.out.println("3.Withdraw");
//         System.out.println("4.Exit");
//         System.out.println("Entre your choice:");
//         int a=sc.nextInt();
//         switch (a) {
//             case 1:
//                 System.out.println("balance 3000");
                
//                 break;
//                 case 2:
//                 System.out.println("Deposit successfully");
                
//                 break;
//                 case 3:
//                 System.out.println("Withdravel successfully");
                
//                 break;
//                 case 4:
                    
                    
//                 System.out.println("thank you");
                
//                 break;
               
                
               
//             default:
//                 System.out.println("invalid choice4");
//                 break;
//         }
//     }
// }



//Print numbers from 1 to N.

// import java.util.*;
// public class Day05{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.println(i);
//         }
//     }
// }


//Print N to 1.

import java.util.*;
public class Day05{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
    }
}
