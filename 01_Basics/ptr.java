import java.util.*;

public class ptr{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        
        double amount = sc.nextDouble();

        System.out.println("Enter rate of intrest");

        double rate = sc.nextDouble();

        System.out.println("Enter time in months  ");

        double time = sc.nextDouble();



        double SI = (amount*rate*time)/100;

        System.out.println("Simple intrest :"+ SI);



        

    }
}