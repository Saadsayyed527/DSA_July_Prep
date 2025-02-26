import java.util.ArrayList;

class day1 {
    public static void main(String[] args) {
    // 1 ) Write a program to find the sum of all elements in an array.
      
//     int arr[] ={1,2,3,4};
//     int sum = 0;
//     for(int i = 0;i<arr.length;i++){
//         sum = sum +  arr[i];
//     }
//    System.err.println(sum );
  

    // 2) Write a  program to find the maximum element in an array.
//     int arr[] ={1,2,3,4};
//     int max = arr[0];
//     for(int i = 1;i<arr.length;i++){
//         max = Math.max(max, arr[i]);
//     }
//    System.err.println(max );
  

//    3) Write a  program to count the number of even numbers in an array and print them.


int arr[] ={1,2,3,4};
int count = 0;

    ArrayList<Integer> ar = new ArrayList<>();
    for(int i = 1;i<arr.length;i++){
     if(arr[i]%2==0){
        ar.add(arr[i]);
        count++;
     }
    }
   System.err.println("The count is  " + count   + " And  the numbers are   "+  ar);

    }
   

}