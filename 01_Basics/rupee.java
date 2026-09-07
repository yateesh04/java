import java.util.*;
public class rupee{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees :");
        double rupees = sc.nextDouble();

        double usd = rupees/83.0;
        System.out.print("Amount in usd :"+usd);
        sc.close();
    }
}