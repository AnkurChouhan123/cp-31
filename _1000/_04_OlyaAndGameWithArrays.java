package _1000;

import java.util.Scanner;

public class _04_OlyaAndGameWithArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long minFirst = Long.MAX_VALUE;
            long minSecond = Long.MAX_VALUE;
            long sumSecond = 0;

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();

                long first = Long.MAX_VALUE;
                long second = Long.MAX_VALUE;

                for (int j = 0; j < m; j++) {
                    long x = sc.nextLong();

                    if (x < first) {
                        second = first;
                        first = x;
                    } else if (x < second) {
                        second = x;
                    }
                }

                minFirst = Math.min(minFirst, first);
                minSecond = Math.min(minSecond, second);
                sumSecond += second;
            }

            System.out.println(sumSecond - minSecond + minFirst);
        }

        sc.close();
    }
}
