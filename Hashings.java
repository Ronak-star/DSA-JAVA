// majority of Elements


//import java.util.HashSet;



// import java.util.*;

// public class Hashings{
//   public static void majorityElement(int nums[]){
//   HashMap<Integer, Integer> map = new HashMap<>();
//   int n =  nums.length;
//   for(int i=0; i<n; i++ ){
//     if(map.containsKey(nums[i])){// true
//     map.put(nums[i], map.get(nums[i]) + 1);

//     }else{ // false
//       map.put(nums[i],  1);
//     }
//   }
//    for(int key: map.keySet()){
//     if(map.get(key)> n/3){
//       System.out.println(key);
//     }
//    }
//   }
//   public static void main(String[] args) {// O(n)
      
//       int nums [] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; //1
//       majorityElement(nums);

//   }
// }


// union of 2 arrays



// import java.util.*;
// public class Hashings{
//   public static int union(int arr1[], int arr2[]){ //O(n)
//     HashSet<Integer> set = new HashSet<>();

//     for(int i=0; i<arr1.length; i++){
//       set.add(arr1[i]);
//     }

//     for(int j=0; j<arr2.length; j++){
//       set.add(arr2[j]);
//     }
//     return set.size();
//   }
  
//   public static void main(String[] args) {
//       int arr1[] ={7,3, 9};
//       int arr2[] = {6, 3, 9, 2, 9, 4};
//       System.out.println(union(arr1, arr2));
    
//   }
// }


// Intersectin of  2 arrays

// import java.util.HashSet;
// public class Hashings{
//   public static int Intersectin(int arr1[], int arr2[]){
//     HashSet<Integer> set = new HashSet<>();
//     int Count = 0;

//     for(int i=0; i<arr1.length; i++){
//       set.add(arr1[i]);
//     }
//     for(int j=0; j<arr2.length; j++){
//       if(set.contains(arr2[j])){
//       Count++;
//       set.remove(arr2[j]);

//     }
//     }
//     return Count;
//   }
//   public static void main(String[] args) {
//       int arr1 [] = {7, 3, 9};
//       int arr2[] = {6, 3, 9, 2, 9, 4};
//       System.out.println(Intersectin(arr1, arr2));
//   }
// }




// Find Itinerary from Tickets




// import java.util.*;

// public class Hashings {

//     public static String getStart(HashMap<String, String> tick) {
//         HashMap<String, String> revMap = new HashMap<>();

//         // Reverse the map
//         for (String key : tick.keySet()) {
//             revMap.put(tick.get(key), key);
//         }

//         // Find the starting point
//         for (String key : tick.keySet()) {
//             if (!revMap.containsKey(key)) {
//                 return key;
//             }
//         }

//         return null;
//     }

//     public static void main(String args[]) {

//         HashMap<String, String> tickets = new HashMap<>();

//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getStart(tickets);

//         while (tickets.containsKey(start)) {
//             System.out.print(start + " -> ");
//             start = tickets.get(start);
//         }

//         System.out.println(start);
//     }
// }


// Subarray Sum Equal to K
// import java.util.*;

// public class Hashings {

//     public static void main(String[] args) {

//         int arr[] = {10, 2, -2, -20, 10};   // Answer = 3
//         int k = -10;

//         // Prefix Sum -> Frequency
//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Empty subarray
//         map.put(0, 1);

//         int ans = 0;
//         int sum = 0;

//         for (int j = 0; j < arr.length; j++) {

//             sum += arr[j];

//             if (map.containsKey(sum - k)) {
//                 ans += map.get(sum - k);
//             }

//             if (map.containsKey(sum)) {
//                 map.put(sum, map.get(sum) + 1);
//             } else {
//                 map.put(sum, 1);
//             }
//         }

//         System.out.println(ans);
//     }
// }