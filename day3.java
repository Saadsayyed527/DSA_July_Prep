public class day3 {
    public static void main(String[] args) {
        
    //   1)   Find the Sum of All Prime Numbers in an Array.	

 int arr[] = { 1, 2, 3, 4,5 , 6 ,7 };

for(int i = 0 ;i<arr.length;i++){
    for(int j = i ;j<arr.length;j++){
if(arr[j] % arr[i] != 0){

}
    }
}



//    2)     Find the Median of All Elements in an Array.	


//  int arr[] = { 1, 2, 3, 4,5 , 6 ,7 };
// int n = arr.length;
// if(n %2 != 0){
//     System.err.println(arr[n/2]);
// }
// else{
//     double ans = (arr[n/2]+ arr[(n/2)-1])/2.0;

//     System.out.println(ans);
// }

    // 3 ) Reverse an Array Without Using an Extra Array (In-Place).	

//     int arr[] = { 1, 2, 3, 4,5 , 6 ,7 };

//  int s= 0;
//  int e = arr.length-1;
//  while (s<e) {
//     int temp = 0;
//     temp = arr[s];
//     arr[s] =arr[e];
//     arr[e] = temp;
//     e--;
//     s++;
//  }
//         for (int num : arr) {
//             System.out.print(num );
//         }
    }
}
