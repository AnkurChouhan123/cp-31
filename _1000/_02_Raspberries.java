package _1000;

import java.util.Scanner;

public class _02_Raspberries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            int even = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if ((arr[i] & 1) == 0) {
                    even++;
                }
            }

            int min = Integer.MAX_VALUE;

            for (int a : arr) {
                if (a % k == 0) {
                    min = 0;
                    break;
                }
                min = Math.min(min, k - a % k);
            }

            if (k == 4) {
                if (even >= 2) {
                    min = 0;
                } else if (even == 1) {
                    min = Math.min(min, 1);
                } else {
                    min = Math.min(min, 2);
                }
            }


            System.out.println(min);

        }

    }

}
