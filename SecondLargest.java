// import java.util.*;
// class SecondLargest{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Size of an array: ");
//         int s = sc.nextInt();
//         System.out.println("Enter the elements: ");
//         int[] arr = new int[s];

//         for(int i=0; i< s;i++){
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);

//         // System.out.println(Arrays.toString(arr));

//         int largestEle = arr[s-1];
//         int SecondLargestEle = -1;

//         for(int i= s-2; i >=0; i--){
//             if(arr[i] < largestEle){
//                 SecondLargestEle = arr[i];
//                 break;
//             }
//         }
//         if(SecondLargestEle == -1){
//             System.out.println("There is No Second Largest Element");
//         }else{
//             System.out.println("Second Largest Element is :" + SecondLargestEle);
//         }
//     }
    
// }

// _________________________________________________________________________________________________________

// Better Approach

// import java.util.*;
// class SecondLargest{
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array: ");
//         int n = sc.nextInt();

//         System.out.println("Enter the Elements: ");
//         int [] arr = new int[n];
//         for(int i=0; i< n;i++){
//             arr[i] = sc.nextInt();
//         }

//         int largest=-1;
//         int  secLargest = -1;

//         for(int i=0; i<n;i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//         for(int i=0; i< n; i++){
//             if(arr[i] > secLargest && arr[i] != largest ){
//                 secLargest = arr[i];
//             }
//         }
//         System.out.println(secLargest);
//     }
// }

// _____________________________________________________________________________________

// Optimal Approach

import java.util.*;
class SecondLargest{
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements: ");
        int [] arr = new int[n];
        for(int i=0; i< n;i++){
            arr[i] = sc.nextInt();
        }

        int largest=-1;
        int  secLargest = -1;

        for(int i = 0; i< n; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element is : " + secLargest);
    }
}