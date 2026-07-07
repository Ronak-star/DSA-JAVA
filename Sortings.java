// 1. Bubblle sort

// class Sortings{

//  public static void printArray(int arr[]){
//   for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i] + " ");
//   }
//   System.out.println();
//  }
  
//   public static void main(String[] args) {
//     int arr[] = {7,8,3,1,2};
//   // time complexity = O(n^2)
//     // bubble sort
//     for(int i=0; i<arr.length-1; i++){ // n - 1
//       for(int j=0; j<arr.length-i-1; j++){
//       if(arr[j] > arr[j+1]){
//         // swap
//       int temp = arr[j];
//       arr[j] = arr[j+1];
//       arr[j+1] = temp;
//       }

//       }
//     }
//     printArray(arr);
      
//   }
// } 

//2 Selection sort



// class Sortings{

//  public static void printArray(int arr[]){
//   for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i] + " ");
//   }
//   System.out.println();
//  }
  
//   public static void main(String[] args) {
//     int arr[] = {7,8,3,1,2};
        // time complexity = O(n^2)
//     // selection sort
//     for(int i=0; i<arr.length-1; i++){
//       int smallest = i;
//       for(int j=i+1; j<arr.length; j++){
//         if(arr[smallest] > arr[j]){
//              smallest = j;
//         }
       

//       }
//       int temp = arr[smallest];
//       arr[smallest] = arr[i];
//       arr[i] = temp;
//     }
//   printArray(arr);
//   }
// } 

// 3. insertion sort

// class Sortings{

//  public static void printArray(int arr[]){
//   for(int i=0; i<arr.length; i++){
//     System.out.print(arr[i] + " ");
//   }
//   System.out.println();
//  }
  
//   public static void main(String[] args) {
//     int arr[] = {7,8,3,1,2};
    
//     //insertion sort
//     for(int i=1; i<arr.length; i++){
//       int current = arr[i];
//       int j = i-1;
//       while( j>= 0 && current < arr[j]){
//         arr[j+1] = arr[j];
//         j--;
//       }

//       // placement
//       arr[j+1] = current;
//     }
//     printArray(arr);
//   }
// } 

// 4. Merge sort




// class Sortings{
//         // nlogn TC
//         public static void conquer(int arr[], int si, int mid, int ei){
//             int merged[] = new int[ei - si + 1];
//             int idx1 = si;
//             int idx2 = mid+1;
//             int x = 0;

//             while(idx1 <= mid && idx2 <= ei){
//                 if(arr[idx1] <= arr[idx2]){
//                         merged[x++] = arr[idx1++];
                        
//                 }else{
//                         merged[x++] = arr[idx2++];
//                 }
//             }
//             while(idx1 <= mid){
//                 merged[x++] = arr[idx1++];
//             }
//             while(idx2 <= ei){
//                 merged[x++] = arr[idx2++];
//             }
//             for(int i=0, j=si; i<merged.length; i++, j++){
//                   arr[j] = merged[i];
//             }
//         }
//         public static void divide(int arr[], int si, int ei){
//                 if(si>=ei){
//                         return;
//                 }
//              int   mid = si + (ei-si)/2;
//                 divide(arr, si, mid);
//                 divide(arr, mid+1, ei);
//                 conquer(arr, si, mid, ei);
//         }
//         public static void main(String[] args) {
//             int arr[] = {6, 3, 9, 5, 2, 8};
//             int n = arr.length;

//             divide(arr, 0, n-1);
//             // print
//             for(int i=0; i<n; i++){
//                 System.out.print(arr[i]+" ");

//             }
//             System.out.println();
//         }
// }

// 5. Quick sort

// class Sortings{
//         public static int partition(int arr[], int low, int high){
//                 int pivot = arr[high];
//                 int i = low-1;

//                 for(int j=low; j<high; j++){
//                         if(arr[j] < pivot){
//                                 i++;
//                                 // swap
//                                 int temp = arr[i];
//                                 arr[i] = arr[j];
//                                 arr[j] = temp;
//                         }
//                 } 
//                 i++;
//               int temp =  arr[i];
//               arr[i] = pivot;
//               arr[high] = temp;
//               return i;
//         }
//         public static void quickSort(int arr[], int low, int high){
//            if(low < high){
//                 int pidx = partition(arr, low, high);

//                 quickSort(arr, low, pidx-1);
//                 quickSort(arr, pidx+1, high);
//            }
//         }
//         public static void main(String[] args) {
//             int [] arr = {6, 3, 9, 5, 2, 8};
//             int n = arr.length;

//             quickSort(arr, 0, n-1);

//             //print
//             for(int i=0; i<n; i++){
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//         }
// }