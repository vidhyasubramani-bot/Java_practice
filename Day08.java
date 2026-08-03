// Print a 5x5 square of asterisks
// import java.util.*;
// public class Day08 {
//     public static void main(String[] args) {
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }

      
//     }
// }


//Right Triangle 
// import java.util.*;
// public class Day08{
//     public static void main(String[]args){
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
    
// }


//52. Inverted Triangle
// import java.util.*;
// public class Day08{
//     public static void main(String[]args){
//         for(int i=5;i>=1;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
    
// }



// Number Triangle
// import java.util.*;
// public class Day08{
//     public static void main(String[]args){
//         for(int i=1;i<5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
    
// }


//Alphabet Triangle
// import java.util.*;
// public class Day08{
//     public static void main(String[]args){
//         for(int i=1;i<5;i++){
//             for(char ch='A';ch<'A'+i;ch++){
//                 System.out.print(ch);
//             }
//             System.out.println();
//         }

//     }
    
// }




import java.util.*;
public class Day08{
    public static void main(String[]args){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}