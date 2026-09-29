import java.util.*;
public class elementsearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        for(int i =0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Target :");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found Element");
        }else{
            System.out.println("Elemnt not found");
        }
    }
}
