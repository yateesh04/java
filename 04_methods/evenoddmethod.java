import java.util.*;
public class evenoddmethod{
    static int evenodd (int num){
        if(num%2==0){
            System.out.print("even");
        }else{
            System.out.print("odd");
        }
        return num;
    

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        evenodd(num);


    }
}

