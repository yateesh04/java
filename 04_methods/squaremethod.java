import java.util.*;
public class squaremethod {
    static int square(int num){
        int ans = num*num;
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans =square(num);
        System.out.print(ans);
    }
}