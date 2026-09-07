import java.util.*;
public class areaofcircle{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double pie = 3.14;
        System.out.print("Enter radius :");
        double r = in.nextDouble();
        double A = pie*r*r;
        System.out.print("Area of circle :"+A);
        in.close();
    }
}