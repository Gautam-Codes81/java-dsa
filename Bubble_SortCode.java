//package DSA_with_java.Sorting_all_question;

// public class Bubble_SortCode {
//     public static void bubbleSort(int arr[]){
//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j=0; j<arr.length-1-turn; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArray(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }


//     public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         bubbleSort(arr);
//         printArray(arr);
//     }
// }

/*public class Bubble_SortCode {
  /*   public static void bubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } */

   /* public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    } */

    //   /  public static void Bubblesort2(int arr2[]){
    //         for(int turn = 0; turn<arr2.length-1; turn++){
    //             for(int j = 0; j<arr2.length-1-turn; j++){
    //                 if(arr2[j]>arr2[j+1]){
    //                     int temp = arr2[j];
    //                     arr2[j] = arr2[j+1];
    //                     arr2[j+1] = temp;
    //                 }
    //             }
    //         }
    //     }
//         public static void printArray(int arr2[]){
//             for(int i = 0; i<arr2.length; i++){
//                 System.out.print(arr2[i]+" ");
//             }
//         }

//            public static void selectionSort(int arr[]){
//     for(int i = 0; i<arr.length-1; i++){
//         int minPos = i;
//         for(int j = i+1; j<arr.length; j++){
//             if(arr[minPos] > arr[j]){
//                 minPos = j;
//             }
//         }
//         int temp = arr[minPos];
//         arr[minPos] = arr[i];
//         arr[i] = temp;
//     }
//  }


    // public static void main(String[] args) {
    //     // int arr[] = {11,46,33,35,25,45,15,20,26};
    //     // bubbleSort(arr);
    //     // printArray(arr);

    //   int arr2 [] = {8,7,6, 10,9,11,56,45};
    //   selectionSort(arr2);
    //    printArray(arr2);
       
  
    // }
//} */ 

public class Bubble_SortCode {
 //    public static void BubbleSort(int arr[]){
  //     for(int i = 0; i<arr.length-1; i++){
  //      for(int j = 0; j<arr.length-1-i; j++){
//         if(arr[j]>arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//         }
//      }

//     }
//    }

public static void bubbleSort(int arr2[]){
    for(int i = 0; i<arr2.length-1; i++){
        for(int j = 0; j<arr2.length-1-i; j++){
            if(arr2[j]>arr2[j+1]){
                int temp = arr2[j];
                arr2[j] = arr2[j+1];
                arr2[j+1] = temp;
            }
        }
    }
}

 

   public static void printArray(int arr2[]){
    for(int i = 0; i<arr2.length; i++){
        System.out.print(arr2[i]+" ");
    }
    System.out.println();
   }
    public static void main(String[] args) {
    //     int arr [] = {5,4,1,3,2};
    //   BubbleSort(arr);
    int arr2 [] = {3,5,7,9,23,6,1,2,25};
     bubbleSort(arr2);
      printArray(arr2);

    }
}
