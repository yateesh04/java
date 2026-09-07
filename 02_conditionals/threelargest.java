import java.util.*;
public class threelargest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = a;
        if(b>a){
            max = b;
        }if (c>b){
            max = c;
        }
        System.out.print("The largest number is : "+max);
    }
}