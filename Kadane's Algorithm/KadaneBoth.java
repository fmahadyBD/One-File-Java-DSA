/*
 * GeeksforGeek Link:https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category[]=Arrays&sortBy=submissions
 */
public class KadaneBoth {
    public static int main(String[] args) {
        int b=0;
        int arr[]={1,3};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                b++;
            }
        }
        if(b!=n){
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }else if(sum<0){
                sum=0;
            }
        }
        return max;
        }else{
            
       int current_max=arr[0];
       int max_so=arr[0];
       for(int i=0;i<arr.length;i++){
   current_max=Math.max(arr[i],current_max+arr[i]);
   max_so=Math.max(current_max,max_so);

       }
       return max_so;
        }
    }
    
}
