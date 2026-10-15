package _1000;

import java.util.Scanner;

public class _06_SkiResort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            int seqCnt = 0;

            long ans = 0;


            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                if(num <= q){
                    seqCnt++;
                }
                else{
                    if (seqCnt >= k) {
                        long total = findSubarrays(seqCnt);

                        long smaller = (long) (k - 1) * (2L * seqCnt - k + 2) / 2;

                        ans += total - smaller;
                    }


                    seqCnt = 0;
                }
            }

            if (seqCnt >= k) {
                long total = findSubarrays(seqCnt);

                long smaller = (long) (k - 1) * (2L * seqCnt - k + 2) / 2;

                ans += total - smaller;
            }

            System.out.println(ans);
        }
    }

    static long findSubarrays(int n){
        return ((long)n * (n + 1)) / 2;
    }

}
