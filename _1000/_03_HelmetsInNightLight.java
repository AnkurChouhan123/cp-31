package _1000;

import java.util.Arrays;
import java.util.Scanner;

public class _03_HelmetsInNightLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int p = sc.nextInt();

            int[] a = new int[n];

            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                arr[i][0] = a[i];
            }

            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                arr[i][1] = b[i];
            }

            Arrays.sort(arr, (x, y) -> {
                if (x[1] == y[1]) {
                    return y[0] - x[0];
                }

                return x[1] - y[1];
            });


            if (p <= arr[0][1]) {
                System.out.println((long)p * n);
            }
            else {
                long totalCost = p;

                int i = 0;
                int j = 1;

                while(j < n){
                    if(arr[i][1] < p){
                        totalCost += Math.min((long) arr[i][0] * arr[i][1], (long)arr[i][1] * (n - j));
                        j += arr[i][0];
                        i++;
                    }

                    else{
                        totalCost += (long) p * (n - j);
                        break;
                    }
                }

                System.out.println(totalCost);
            }

        }
    }
}
