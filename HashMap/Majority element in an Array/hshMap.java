import java.util.HashMap;

public class hshMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2};
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int element : arr) {
            if (countMap.containsKey(element)) {
              countMap.put(element, countMap.get(element) + 1);
            } else {
              countMap.put(element, 1);
            }
          }
          
          System.out.println(countMap);

          int n = arr.length;  
          int majorityElement = -1;

          for (int key : countMap.keySet()) {
            if (countMap.get(key) > n / 2) {
              majorityElement = key;  
              break;
            }
          }
          
          System.out.println("The majority element is: " + majorityElement);

        }
      }
      

   
    
    

