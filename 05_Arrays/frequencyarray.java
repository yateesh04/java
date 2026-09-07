import java.util.*;
public class frequencyarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
         int target = sc.nextInt();
         int count =0;
         for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
         }
         System.out.println(count);
    }
    
}
