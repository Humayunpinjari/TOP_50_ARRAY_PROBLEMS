// Brute Force

// import java.util.*;
// public class ThirdLargest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array: ");
//         int n = sc.nextInt();

//         System.out.println("Enter the Elements: ");
//         int [] arr = new int[n];
//         for(int i = 0; i< n;i++){
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr);
//         int thirdLargest = arr[n-3];
//         System.out.println(thirdLargest);
//     }
// }

// ___________________________________________________________________________________


// Better  

// import java.util.*;
// public class ThirdLargest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array: ");
//         int n = sc.nextInt();

//         System.out.println("Enter the Elements: ");
//         int [] arr = new int[n];
//         for(int i = 0; i< n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int first  = Integer.MIN_VALUE;
//         for(int i= 0; i< n;i++){
//             if(arr[i] > first){
//                 first = arr[i];
//             }
//         }

//         int second = Integer.MIN_VALUE;
//         for(int i=0; i< n;i++){
//             if((arr[i] > second )&& (arr[i] < first)){
//                 second = arr[i];
//             }
//         }

//         int third = Integer.MIN_VALUE;
//         for(int i=0; i< n;i++){
//             if((arr[i] > third) && (arr[i] < second)){
//                 third = arr[i];
//             }
//         }

//         System.out.println(third);
//     }
// }

// _______________________________________________________________________________________________

//  optimal 

import java.util.*;
public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int [] arr = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
       int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

       for(int i=0; i< n; i++){
        if(arr[i] > first){
            third = second;
            second = first;
            first = arr[i];
        }else if ((arr[i] > second) && (arr[i] < first)){
            third = second;
            second = arr[i];
        }else if(arr[i] > third){
            third = arr[i];
        }
       }
       System.out.println(third);
    }
}