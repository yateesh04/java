import java.util.*;
public class rightrotationarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }  
        arr[0] = last;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }
} 
