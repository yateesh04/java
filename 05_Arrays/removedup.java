import java.util.*;
public class removedup {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<arr.length;i++){
            boolean alreadyprinted = false;
            for(int j =0;j<i;j++){
                if(arr[i]==arr[j]){
                    alreadyprinted = true;
                    break;
                }
            }
            if(!alreadyprinted){
                System.out.print(arr[i]+" ");
            }
        }

    }
    
}
