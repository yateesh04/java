import java.util.*;

public class smallelementineachcolumn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // Input
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Smallest element in each column
        for(int j = 0; j < arr[0].length; j++) {

            int min = arr[0][j];

            for(int i = 0; i < arr.length; i++) {

                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            System.out.println(min);
        }
    }
}