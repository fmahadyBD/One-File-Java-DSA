/*
 */
public class kadaneNegative {
    public static int main(String[] args) {

    
       int arr[]={-1,-2,-4,-2};
       int current_max=arr[0];
       int max_so=arr[0];
       for(int i=0;i<arr.length;i++){
   current_max=Math.max(arr[i],current_max+arr[i]);
   max_so=Math.max(current_max,max_so);

       }
       return max_so;
    }
    
}
