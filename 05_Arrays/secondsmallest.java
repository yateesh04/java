import java.util.*;
public class secondsmallest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secondsmallest && arr[i] != smallest){
                secondsmallest = arr[i];
            }
        }
        System.out.println(secondsmallest);
    }
}
