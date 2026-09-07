import java.util.*;
public class temp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celcius :");
        double temp = sc.nextDouble();
        double F = (temp*1.8)+32;
        System.out.print("temperatue in Fahrenheit :"+F);
    }
}