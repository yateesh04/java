import java.util.*;
public class searchinrange {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
       for(int i = 0; i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
        System.out.print("Enter star:");
        int start = sc.nextInt();
        System.out.print("Enter end:");
        int end = sc.nextInt();
        int target = sc.nextInt();
        boolean found = false;
        for (int i = start ; i<=end;i++){
            if(arr[i]==target){
                found = true;
                System.out.print("Element found at index "+" "+ i);
                break;
            }
        }
        if(!found){
            System.out.print("Element not found");
        }
    }
}
