import java.util.*;
public class swaparray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]arr= new int[5];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    
}
