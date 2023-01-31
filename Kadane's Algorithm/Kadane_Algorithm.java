
/*
 * Link:https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category[]=Arrays&sortBy=submissions
 */
public class Kadane_Algorithm {
    public static int main(String[] args) {
        int a[]={1,2,3,-4,5,6};
        int max=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(sum>max){
                max=sum;
            }else if(sum<0){
                sum=0;
            }
        }
        return max;
    }
        
    }
    

