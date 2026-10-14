package _800;

import java.util.Scanner;

public class _2_LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
           int n = sc.nextInt();
           int x = sc.nextInt();
           int[] arr = new int[n];
           for(int i = 0; i < n; i++){
               arr[i] = sc.nextInt();
           }

           int maxDist = 0;

           maxDist = Math.max(maxDist, arr[0] - 0);
           maxDist = Math.max(maxDist, 2 * (x - arr[n - 1]));

           for(int i = 1; i < n; i++){
               maxDist = Math.max(maxDist, arr[i] - arr[i - 1]);
           }

            System.out.println(maxDist);
        }


    }
}
