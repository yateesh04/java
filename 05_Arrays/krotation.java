import java.util.Scanner;
public class krotation {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();

        for(int r =0 ; r<k; r++){
            int first = arr[0];
        
        for(int i =0 ; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}
